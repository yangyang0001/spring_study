package com.deepblue.spring_study_001_bean;


import com.deepblue.spring_common.CommonConstant;
import com.deepblue.spring_study_001_bean.spring_001_entity.NormalXMLBean;
import com.interface21.beans.factory.BeanFactory;
import com.interface21.beans.factory.xml.XmlBeanFactory;

public class BeanFactoryTest {



    public void testXmlBeanFactory() {


        //1.一般的XMLBean
        BeanFactory beanFactory = new XmlBeanFactory(CommonConstant.FILE_BASE_PATH + "/src/com/deepblue/spring_study_001_bean/study_001_bean.xml");
        NormalXMLBean normalXMLBean = (NormalXMLBean) beanFactory.getBean("normalXMLBean");
        System.out.println(normalXMLBean.getName());

        System.out.println("---------------------------------------------------------------------");
        /*
        //2.这里是获取 meta 元数据的使用
        MetaXMLBean metaXMLBean = (MetaXMLBean) beanFactory.getBean("metaXMLBean");
        BeanDefinition beanDefinition = ((XmlBeanFactory)beanFactory).getBeanDefinition("metaXMLBean");
        String key = "metaKey";
        String value = beanDefinition.getAttribute(key).toString();
        System.out.println("key is :" + key + ", value is :" + value);

        System.out.println("---------------------------------------------------------------------");

        //3.lookup 的 获取器 的注入  类注入器的使用
        LookupMethodBean lookupMethodBean = (LookupMethodBean) beanFactory.getBean("lookupMethodBean");
        lookupMethodBean.showMe();

        System.out.println("---------------------------------------------------------------------");

        //4.replaced 的 方法注入器的使用
        ReplacedMethodBean replacedMethodBean = (ReplacedMethodBean) beanFactory.getBean("replacedMethodBean");
        replacedMethodBean.replace();

        System.out.println("---------------------------------------------------------------------");

        //5.constructor-args 构造方法子元素的使用
        ConstructXMLBean constructXMLBean = (ConstructXMLBean) beanFactory.getBean("constructXMLBean");
        System.out.println(constructXMLBean.getUsername() + "," + constructXMLBean.getPassword());

        System.out.println("---------------------------------------------------------------------");

        //6.property属性的解析
        PropertyXMLBean propertyXMLBean = (PropertyXMLBean) beanFactory.getBean("propertyXMLBean");
        System.out.println(JSON.toJSONString(propertyXMLBean));

        System.out.println("---------------------------------------------------------------------");

        //7. qualifier 的使用
        QualifierXMLBean qualifierXMLBean = (QualifierXMLBean) beanFactory.getBean("qualifierXMLBean");
        System.out.println(JSON.toJSONString(qualifierXMLBean));
        */
    }

    public static void main(String[] args) {
        BeanFactoryTest test = new BeanFactoryTest();
        test.testXmlBeanFactory();
    }
}
