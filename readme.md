# SSM整合的**企业权限管理系统**

使用mysql数据库 + SSM框架 搭建的简易版企业权限管理系统，实现用户角色、用户权限、产品管理等功能。

![首页展示](https://github.com/yours-candy/ssm-demo/blob/1f66b824352327123c635aae81068e4b5496c4cd/img/首页显示.png)

## 1.功能介绍  

主要基于maven工程搭建，以及基于mysql数据库的商品表信息，并完成SSM整合。

## 1.2 商品查询

基于SSM整合基础上完成商品查询，主面页面main.jsp及商品显示页面product-list.jsp页面的创建。

## 1.3 商品添加

进一步完成SSM整合，并完成商品添加功能，完成事务操作以及product-add.jsp页面生成。

## 1.4 订单查询

订单的查询操作，它主要完成简单的多表查询操作，查询订单时，需要查询出与订单关联的其它表中信息，所以要了解订单及其它表关联关系。

## 1.5 订单分页查询

订单分页查询，我们使用的是mybatis分页插件PageHelper，要掌握PageHelper的基本使用。

## 1.6 订单详情查询

订单详情是用于查询某一个订单的信息，这个知识点主要是对复杂的多表查询操作

## 1.7 Spring Security 概述

Spring Security是 Spring 项目组中用来提供安全认证服务的框架，它的使用很复杂，只有对spring Security的基本操作，spring Security框架的配置及基本的认证与授权操作。

## 1.8 用户管理

用户管理中是基于spring Security的用户登录、退出操作。以及用户查询、添加、详情有等操作，这些功能的练习是对SSM知识点的进一步巩固。

## 1.9 角色管理

角色管理主要完成角色查询、角色添加

## 1.10 资源权限管理

资源权限管理主要完成查询、添加操作，它的操作与角色管理类似，角色管理以及资源权限管理都是对权限管理的补充  

## 1.11 权限关联与控制

主要会讲解用户角色关联、角色权限关联，这两个操作是为了后续我们完成授权操作的基础，关于授权操作我们会在服务器端及页面端分别讲解

## 1.12 AOP日志处理

AOP日志处理，我们使用spring AOP切面来完成系统级别的日志收集。  





# 数据库介绍：

## 2.1 产品表  

![产品表](https://github.com/yours-candy/ssm-demo/blob/1f66b824352327123c635aae81068e4b5496c4cd/img/2.1.png)

## 2.2 订单表

![订单表](https://github.com/yours-candy/ssm-demo/blob/1f66b824352327123c635aae81068e4b5496c4cd/img/2.2.png)

## 2.3 会员表

![会员表](https://github.com/yours-candy/ssm-demo/blob/1f66b824352327123c635aae81068e4b5496c4cd/img/2.3.png)

## 2.4 旅客表

![旅客表](https://github.com/yours-candy/ssm-demo/blob/1f66b824352327123c635aae81068e4b5496c4cd/img/2.4.png)

## 2.5 用户表

![用户表](https://github.com/yours-candy/ssm-demo/blob/1f66b824352327123c635aae81068e4b5496c4cd/img/2.5.png)

## 2.6 角色表

![角色表](https://github.com/yours-candy/ssm-demo/blob/1f66b824352327123c635aae81068e4b5496c4cd/img/2.6.png)

## 2.7 资源权限表

![资源权限表](https://github.com/yours-candy/ssm-demo/blob/1f66b824352327123c635aae81068e4b5496c4cd/img/2.7.png)

## 2.8 日志表

![日志表](https://github.com/yours-candy/ssm-demo/blob/1f66b824352327123c635aae81068e4b5496c4cd/img/2.8.png)
