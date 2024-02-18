@SpringBootApplication : this is the main entry of the application.
	Indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning. 
	This is a convenience annotation that is equivalent to declaring @SpringBootConfiguration, @EnableAutoConfiguration and @ComponentScan.
	
SpringBootConfiguration:
EnableAutoConfiguration:
ComponentScan: 

can we have multiple springbootapplication annotation in our project ?
yes, we can have multiple @springbootapplcaition annotations.

@Conditional autoconfiguration

LOADING BEAN AT RUN TIME
	Sometimes, we face some issues while configuring beans in Spring application. 
	We may have to restart the application each time we made any changes in configuration file.
	To avoid such problems, we have an option to load the beans at run time.
	ConfigurableApplicationContext configContext = (ConfigurableApplicationContext)applicationContext;
	SingletonBeanRegistry beanRegistry = configContext.getBeanFactory();
	MyBean bean=new MyBean();
	beanRegistry.registerSingleton("myBeanName", bean);
	And if we need to remove registered beans at runtime, we can do the same as below
	
	beanRegistry.removeBeanDefinition("bean") 
	                  or
	beanRegistry.destroySingleton("bean")