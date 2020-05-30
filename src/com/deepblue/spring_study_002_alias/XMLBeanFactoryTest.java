package com.deepblue.spring_study_002_alias;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.Arrays;

public class XMLBeanFactoryTest {

    @Test
    public void testXmlBeanFactory() {

        //1.alias解析
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("study_002_alias.xml"));
        String[] aliasArr = beanFactory.getAliases("xmlAliasBean");
        Arrays.stream(aliasArr).forEach(System.out::println);

    }
}
