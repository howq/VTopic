/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : vtopicdb

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2017-03-25 14:50:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `CATEGORYID` bigint(20) NOT NULL,
  `CATEGORYNAME` char(20) DEFAULT NULL,
  `CATEGORYINFO` varchar(100) DEFAULT NULL,
  `CREATER` varchar(18) DEFAULT NULL,
  `CREATDATETIME` datetime DEFAULT NULL,
  `CHANGER` varchar(18) DEFAULT NULL,
  `CHANGEDATETIME` datetime DEFAULT NULL,
  `DELETEMAN` varchar(18) DEFAULT NULL,
  `DELETEDATETIME` datetime DEFAULT NULL,
  `DELETEFLG` char(1) NOT NULL,
  PRIMARY KEY (`CATEGORYID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `MAJORID` bigint(20) NOT NULL,
  `MAJORNAME` char(20) DEFAULT NULL,
  `MAJORINFO` varchar(100) DEFAULT NULL,
  `CREATER` varchar(18) DEFAULT NULL,
  `CREATDATETIME` datetime DEFAULT NULL,
  `CHANGER` varchar(18) DEFAULT NULL,
  `CHANGEDATETIME` datetime DEFAULT NULL,
  `DELETEMAN` varchar(18) DEFAULT NULL,
  `DELETEDATETIME` datetime DEFAULT NULL,
  `DELETEFLG` char(1) NOT NULL,
  PRIMARY KEY (`MAJORID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `RECORDID` bigint(20) NOT NULL,
  `TOPICID` bigint(20) NOT NULL,
  `STUDENT` varchar(18) NOT NULL,
  `TEACHER` varchar(18) NOT NULL,
  ` OPERATER` varchar(18) NOT NULL,
  `CREATER` varchar(18) DEFAULT NULL,
  `CREATDATETIME` datetime DEFAULT NULL,
  `CHANGER` varchar(18) DEFAULT NULL,
  `CHANGEDATETIME` datetime DEFAULT NULL,
  `DELETEMAN` varchar(18) DEFAULT NULL,
  `DELETEDATETIME` datetime DEFAULT NULL,
  `DELETEFLG` char(1) NOT NULL,
  PRIMARY KEY (`RECORDID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for recordbook
-- ----------------------------
DROP TABLE IF EXISTS `recordbook`;
CREATE TABLE `recordbook` (
  `RECORDBOOKID` bigint(20) NOT NULL,
  `VYEAR` year(4) DEFAULT NULL,
  `STARTTIME` date DEFAULT NULL,
  `ENDTIME` date DEFAULT NULL,
  `MANAGERID` varchar(18) NOT NULL,
  `CREATER` varchar(18) DEFAULT NULL,
  `CREATDATETIME` datetime DEFAULT NULL,
  `CHANGER` varchar(18) DEFAULT NULL,
  `CHANGEDATETIME` datetime DEFAULT NULL,
  `DELETEMAN` varchar(18) DEFAULT NULL,
  `DELETEDATETIME` datetime DEFAULT NULL,
  `DELETEFLG` char(1) NOT NULL,
  PRIMARY KEY (`RECORDBOOKID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `ROLEID` tinyint(3) NOT NULL,
  `ROLEAUTHORIY` char(1) NOT NULL,
  `ROLENAME` varchar(100) NOT NULL,
  `ROLECOMENT` varchar(200) NOT NULL,
  `CREATER` varchar(18) DEFAULT NULL,
  `CREATDATETIME` datetime DEFAULT NULL,
  `CHANGER` varchar(18) DEFAULT NULL,
  `CHANGEDATETIME` datetime DEFAULT NULL,
  `DELETEMAN` varchar(18) DEFAULT NULL,
  `DELETEDATETIME` datetime DEFAULT NULL,
  `DELETEFLG` char(1) NOT NULL,
  PRIMARY KEY (`ROLEID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `TOPICID` bigint(20) NOT NULL,
  `TOPICNAME` varchar(100) DEFAULT NULL,
  `TOPICCOMENT` varchar(200) DEFAULT NULL,
  `CATEGORYID` int(10) DEFAULT NULL,
  `MAJOEID` varchar(80) DEFAULT NULL,
  `LIMITNUM` tinyint(3) DEFAULT NULL,
  `TEACHER` varchar(18) DEFAULT NULL,
  `CREATER` varchar(18) DEFAULT NULL,
  `CREATDATETIME` datetime DEFAULT NULL,
  `CHANGER` varchar(18) DEFAULT NULL,
  `CHANGEDATETIME` datetime DEFAULT NULL,
  `DELETEMAN` varchar(18) DEFAULT NULL,
  `DELETEDATETIME` datetime DEFAULT NULL,
  `DELETEFLG` char(1) NOT NULL,
  PRIMARY KEY (`TOPICID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `USERID` varchar(18) NOT NULL,
  `ROLEID` tinyint(3) NOT NULL,
  `PASSWORD` varchar(64) NOT NULL,
  `LOGINDATETIMETIME` datetime DEFAULT NULL,
  `LOGOUTDATETIMETIME` datetime DEFAULT NULL,
  `USERSTATUS` char(1) DEFAULT NULL,
  `SESSIONID` char(32) DEFAULT NULL,
  `IPADD` char(15) DEFAULT NULL,
  `BLOWSER` varchar(200) DEFAULT NULL,
  `CREATER` varchar(18) DEFAULT NULL,
  `CREATDATETIME` datetime DEFAULT NULL,
  `CHANGER` varchar(18) DEFAULT NULL,
  `CHANGEDATETIME` datetime DEFAULT NULL,
  `DELETEMAN` varchar(18) DEFAULT NULL,
  `DELETEDATETIME` datetime DEFAULT NULL,
  `DELETEFLG` char(1) NOT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `USERID` varchar(18) NOT NULL,
  `ROLEID` tinyint(3) DEFAULT NULL,
  `MAJORID` char(10) DEFAULT NULL,
  `USERNAME` varchar(30) DEFAULT NULL,
  `SEXTYPE` char(1) DEFAULT NULL,
  `USERTEL` varchar(20) DEFAULT NULL,
  `USERMOBILE` varchar(11) DEFAULT NULL,
  `USEREMAIL` varchar(30) DEFAULT NULL,
  `CREATER` varchar(18) DEFAULT NULL,
  `CREATDATETIME` datetime DEFAULT NULL,
  `CHANGER` varchar(18) DEFAULT NULL,
  `CHANGEDATETIME` datetime DEFAULT NULL,
  `DELETEMAN` varchar(18) DEFAULT NULL,
  `DELETEDATETIME` datetime DEFAULT NULL,
  `DELETEFLG` char(1) NOT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
