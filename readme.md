# JBoss5 + Java6 + SpringBoot

Java6 + JBoss5��SpringBoot��war���f�v���C���悤�Ǝ��s���낵���c�[�B
�����ł��B

spring-boot-starter-tomcat�̔r�����Y��B

    java.lang.UnsupportedClassVersionError: org/apache/catalina/authenticator/FormAuthenticator : Unsupported major.minor version 51.0
        at java.lang.ClassLoader.defineClass1(Native Method)
        at java.lang.ClassLoader.defineClassCond(ClassLoader.java:631)

�ȉ��̃G���[���o��̂�spring-boot-starter-batch���Ƃ肠�����ǉ�

    java.lang.ClassNotFoundException: org.springframework.batch.core.configuration.annotation.BatchConfigurer

�ȉ��̗�O���o�ė����オ�炷�B

    Caused by: java.lang.ArrayStoreException: sun.reflect.annotation.TypeNotPresentExceptionProxy
            at sun.reflect.annotation.AnnotationParser.parseClassArray(AnnotationParser.java:653)
            at sun.reflect.annotation.AnnotationParser.parseArray(AnnotationParser.java:460)
            at sun.reflect.annotation.AnnotationParser.parseMemberValue(AnnotationParser.java:286)
            at sun.reflect.annotation.AnnotationParser.parseAnnotation(AnnotationParser.java:222)
            at sun.reflect.annotation.AnnotationParser.parseAnnotations2(AnnotationParser.java:69)
            at sun.reflect.annotation.AnnotationParser.parseAnnotations(AnnotationParser.java:52)
            at java.lang.Class.initAnnotationsIfNecessary(Class.java:3079)
            at java.lang.Class.getAnnotation(Class.java:3038)
            at org.jboss.metadata.annotation.finder.DefaultAnnotationFinder.getAnnotation(DefaultAnnotationFinder.java:23)
            at org.jboss.metadata.annotation.creator.web.Web25MetaDataCreator.validateClass(Web25MetaDataCreator.java:102)
            at org.jboss.metadata.annotation.creator.AbstractCreator.validateClasses(AbstractCreator.java:110)
            at org.jboss.metadata.annotation.creator.AbstractCreator.processMetaData(AbstractCreator.java:80)
            at org.jboss.metadata.annotation.creator.web.Web25MetaDataCreator.create(Web25MetaDataCreator.java:85)
            at org.jboss.deployment.OptAnnotationMetaDataDeployer.processJBossWebMetaData(OptAnnotationMetaDataDeployer.java:98)
            at org.jboss.deployment.OptAnnotationMetaDataDeployer.processMetaData(OptAnnotationMetaDataDeployer.java:70)
            at org.jboss.deployment.AnnotationMetaDataDeployer.deploy(AnnotationMetaDataDeployer.java:177)
            ... 31 more

�Y���ӏ���catch���Ă݂��B

    org.jboss.metadata.annotation.finder.DefaultAnnotationFinder
    public <T extends Annotation> T getAnnotation(E element, Class<T> annotationType) {
        try {
            return element.getAnnotation(annotationType);
        } catch (ArrayStoreException ex){
            log.warn("element=" +element.getClass().getCanonicalName() + " annotationType=" + annotationType.getCanonicalName());
            throw ex;
        }
    }
    
Spring�n�̃A�m�e�[�V��������Ȃ��������������s���B

    WARN  [DefaultAnnotationFinder] element=java.lang.Class annotationType=org.jboss.ejb3.annotation.Service

