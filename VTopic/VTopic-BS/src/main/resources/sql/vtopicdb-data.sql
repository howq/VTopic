/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : vtopicdb

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2017-03-28 08:58:22
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
-- Records of category
-- ----------------------------

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
-- Records of major
-- ----------------------------

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `RECORDID` bigint(20) NOT NULL,
  `TOPICID` bigint(20) NOT NULL,
  `STUDENT` varchar(18) NOT NULL,
  `TEACHER` varchar(18) NOT NULL,
  `OPERATER` varchar(18) NOT NULL,
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
-- Records of record
-- ----------------------------

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
-- Records of recordbook
-- ----------------------------
INSERT INTO `recordbook` VALUES ('1', '2001', '2001-07-12', '2001-08-15', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('2', '2002', '2002-06-12', '2002-06-29', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('3', '2003', '2003-05-12', '2003-06-11', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('4', '2004', '2004-06-16', '2004-07-02', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('5', '2005', '2005-06-15', '2005-07-13', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('6', '2006', '2006-06-14', '2006-06-30', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('7', '2007', '2007-06-20', '2007-07-07', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('8', '2008', '2008-07-17', '2008-10-16', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('9', '2009', '2009-05-11', '2009-06-15', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('10', '2010', '2010-06-23', '2010-07-22', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('11', '2011', '2011-06-14', '2011-07-12', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('12', '2012', '2012-05-15', '2012-06-13', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('13', '2013', '2013-05-20', '2013-06-12', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('14', '2014', '2014-06-10', '2014-06-24', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('15', '2015', '2015-06-09', '2015-07-15', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('16', '2016', '2016-05-17', '2016-07-12', 'admin', 'admin', null, null, null, null, null, '0');

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
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('0', '0', '管理员', '系统管理员', null, '2017-03-15 23:23:17', null, '2017-03-15 23:23:21', null, null, '0');
INSERT INTO `role` VALUES ('1', '1', '教师', '老师', null, '2017-03-16 10:44:42', null, '2017-03-16 10:44:46', null, null, '0');
INSERT INTO `role` VALUES ('2', '2', '学生', '学生', null, '2017-03-16 10:45:09', null, '2017-03-16 10:45:14', null, null, '0');

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
-- Records of topic
-- ----------------------------

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
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', '0', '123456', '2017-03-13 17:04:58', '2017-03-13 17:05:03', null, null, null, null, null, null, null, null, null, null, '0');
INSERT INTO `user` VALUES ('student1', '2', '123456', '2017-03-16 10:45:55', '2017-03-16 10:45:59', null, null, null, null, null, null, null, null, null, null, '0');
INSERT INTO `user` VALUES ('teacher1', '1', '123456', '2017-03-16 10:43:40', '2017-03-16 10:43:43', null, null, null, null, null, null, null, null, null, null, '0');

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

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('admin', '0', 'jsj', '王主任', '1', '18380798765', '15647346788', 'howq@outlook.com', null, '2017-03-16 01:08:53', null, '2017-03-16 01:08:57', null, null, '0');
INSERT INTO `userinfo` VALUES ('student1', '2', 'jsj', '学生1', '0', '13356773467', '15647346788', 'howq@outlook.com', null, '2017-03-16 10:46:59', null, '2017-03-16 10:47:02', null, null, '0');
INSERT INTO `userinfo` VALUES ('teacher1', '1', 'jsj', '老师1', '1', '15647346788', '13356773467', 'howq@outlook.com', null, '2017-03-16 10:47:40', null, '2017-03-16 10:47:45', null, null, '0');
