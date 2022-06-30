# Electronic-Mall
仿mall电子商城后端学习项目

1.我先做了mall-tiny-01，算成功了。但因为名字问题导致混乱，改了一段时间，
然后我打算在做一个。第二个出现了问题，在 运行Generator进行逆向工程时报错:
The specified target project directory
我反复看了generatorConfig.xml，还是没发现错误。
按照网上方法，也没有解决。
最终妥协，把generatorConfig.xml的相关路径改为绝对路径，解决了。
2022/3/23

==================================================3/24================================================
2.yml里配置的
mybatis:
mapper-locations:
是拿来干嘛的？

3.Mybatis逆向工程是怎么工作的？实体类和相应的sql用法等？再了解一些它的配置类和自定义注释生成器等？
还有用Generator对实体类自动生成SwaggerUI注解是哪里来的?(是代码上方的/*注释*/吗，还是数据库里的表带上的)

4.各项目出现import导入爆红问题，Cannot resolve symbol "xxx"(无法解析符号)
疑似内存满了(这几天也有提示说满了)
在文件选框处清理内存后解决了  -2022/3/24

5.
PmsBrandController 类的
@Autowired
private PmsBrandService demoService;
的demoService爆红:无法自动装配。找不到 'PmsBrandService' 类型的 Bean。

另一个演示项目的
PmsBrandServiceImpl类的
@Autowired
private PmsBrandMapper brandMapper;
的brandMapper爆红:无法自动装配。找不到 'PmsBrandMapper' 类型的 Bean。

但这两个项目分别的brandMapper、demoService有没问题

解决方法1:更改设置
https://www.cnblogs.com/longkui-site/p/15858534.html

解决方法2:给PmsBrandService和PmsBrandMapper添加 @Component 即可 (别写成 @Configuration)
https://www.cnblogs.com/qinggua/p/15184468.html
(演示项目也没添加这个，它爆红了)

6.看看common里面的封装类

7.Logger类具体有什么用

8. @ResponseBody作用，为什么要加在参数里

9.参数里有 @RequestParam

10.忘了impl的类加上 @Service，加上了

11.常见注解 @的作用？

12.运行报错

Description:

Field demoService in com.lan.electronicmall.controller.MyController.PmsBrandController required a single bean, but 2 were found:
- pmsBrandServiceImpl: defined in file [D:\java\SpringBoot-Program\Electronic-Mall\target\classes\com\lan\electronicmall\service\impl\PmsBrandServiceImpl.class]
- pmsBrandService: defined in file [D:\java\SpringBoot-Program\Electronic-Mall\target\classes\com\lan\electronicmall\service\PmsBrandService.class]


https://blog.csdn.net/weixin_51799151/article/details/122976089
解决方法:在启动类放 @MapperScan


13.报错
Description:

The dependencies of some of the beans in the application context form a cycle:

┌──->──┐
|  com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration
└──<-──┘


Action:

Relying upon circular references is discouraged and they are prohibited by default. Update your application to remove the dependency cycle between beans. 
As a last resort, it may be possible to break the cycle automatically by setting spring.main.allow-circular-references to true.

解决：
https://blog.csdn.net/weivi001/article/details/122731966
改成yml形式是(缩进是有要求的)：

spring:
main:
allow-circular-references : true


14.在mall整合Swagger-UI实现在线API文档运行项目时
报错:
org.springframework.context.ApplicationContextException: Failed to start bean 'documentationPluginsBootstrapper';
nested exception is java.lang.NullPointerException

Caused by: java.lang.NullPointerException: null

解决方法:
https://blog.csdn.net/qq_43791377/article/details/122653731
先试了加配置
spring:
mvc:
pathmatch:
matching-strategy: ant_path_matcher
不行
又改swagger版本，不行
又在这两个基础上，改了springboot的版本，改成2.5.7，成了(改后刷新maven，2.5.7还是红的，要重新打开idea才行)
(之后我又把那个mvc配置删了)
!!!记得将 @EnableSwagger2注解改为 @EnableOpenApi


15.在
访问Swagger-UI接口文档地址
接口地址：http://localhost:8080/swagger-ui.html 时

报错:

java.lang.NumberFormatException: For input string: ""

这个好像是进入接口地址后就自己产生的

Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception 
[Request processing failed; nested exception is org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.lan.electronicmall.mbg.mapper.PmsBrandMapper.selectByExample] with root cause

========================================================================================================================================
改配置文件，又报错:
Binding to target [Bindable@71e4b308 type = java.lang.String[], value = 'provided', annotations = array<Annotation>[[empty]]] failed:

解决:是配置写错了
https://blog.csdn.net/li1325169021/article/details/103012979
（emmmmm）这里不要加空格

又报错了：各种各种
解决:https://blog.csdn.net/loongshawn/article/details/51656699
看评论区，把所有mybatis逆向工程的文件都删了，再生成一次
=============================================================================================================================================

好，回到访问Swagger-UI接口文档地址
又把刚才删掉的东西导入导入
成功了！！！！！！！！


======================================2022/3/25===================================================================================

======================================2022/3/26=====================================================================
16.无法导入
import org.springframework.data.redis.core.StringRedisTemplate;
解决方法:导入maven依赖

17.了解StringRedisTemplate提供的方法；

18.
