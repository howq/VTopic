/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : vtopicdb

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-05-23 15:43:39
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
INSERT INTO `category` VALUES ('1', '类别1', '类别1描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('2', '类别2', '类别2描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('3', '类别3', '类别3描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('4', '类别4', '类别4描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('5', '类别5', '类别5描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('6', '类别6', '类别6描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('7', '类别7', '类别7描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('8', '类别8', '类别8描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('9', '类别9', '类别9描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('10', '类别10', '类别10描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('11', '类别11', '类别11描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');
INSERT INTO `category` VALUES ('12', '类别12', '类别12描述', '', '2017-05-23 15:36:18', null, '2017-05-23 15:36:21', null, null, '0');

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
INSERT INTO `major` VALUES ('1', '专业1', '专业1描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('2', '专业2', '专业3描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('3', '专业3', '专业3描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('4', '专业4', '专业4描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('5', '专业5', '专业5描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('6', '专业6', '专业6描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('7', '专业7', '专业7描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('8', '专业8', '专业8描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('9', '专业9', '专业9描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('10', '专业10', '专业10描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('11', '专业11', '专业11描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('12', '专业12', '专业12描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('13', '专业13', '专业13描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('14', '专业14', '专业14描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('15', '专业15', '专业15描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');
INSERT INTO `major` VALUES ('16', '专业16', '专业16描述', null, '2017-05-23 15:38:50', null, '2017-05-23 15:38:52', null, null, '0');

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
  `RECORDBOOKID` bigint(20) NOT NULL AUTO_INCREMENT,
  `VYEAR` char(4) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

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
INSERT INTO `recordbook` VALUES ('9', '2009', '2017-02-06', '2017-06-22', 'admin', 'admin', null, 'admin', '2017-05-23 11:18:23', null, null, '0');
INSERT INTO `recordbook` VALUES ('10', '2010', '2010-06-23', '2010-07-22', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('11', '2011', '2011-06-14', '2011-07-12', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('12', '2012', '2012-05-15', '2012-06-13', 'admin', 'admin', null, null, null, null, null, '0');
INSERT INTO `recordbook` VALUES ('13', '2013', '2013-05-20', '2013-06-12', 'admin', 'admin', null, 'admin', '2017-05-23 10:43:55', 'admin', '2017-05-23 10:43:55', '1');
INSERT INTO `recordbook` VALUES ('14', '2014', '2014-06-10', '2014-06-24', 'admin', 'admin', null, 'admin', '2017-05-23 10:36:29', 'admin', '2017-05-23 10:36:29', '1');
INSERT INTO `recordbook` VALUES ('15', '2015', '2015-06-09', '2015-07-15', 'admin', 'admin', null, 'admin', '2017-05-23 10:35:50', 'admin', '2017-05-23 10:35:50', '1');
INSERT INTO `recordbook` VALUES ('16', '2016', '2016-05-17', '2016-07-12', 'admin', 'admin', null, 'admin', '2017-05-23 10:36:14', 'admin', '2017-05-23 10:36:14', '1');
INSERT INTO `recordbook` VALUES ('17', '2017', '2014-02-21', '2014-06-21', 'admin', 'admin', '2017-05-21 17:10:13', 'admin', '2017-05-23 10:33:39', 'admin', '2017-05-23 10:33:39', '1');
INSERT INTO `recordbook` VALUES ('18', '2017', '2014-02-21', '2014-06-21', 'admin', 'admin', '2017-05-22 11:19:05', 'admin', '2017-05-23 10:34:39', 'admin', '2017-05-23 10:34:39', '1');
INSERT INTO `recordbook` VALUES ('19', '2017', '2014-02-21', '2014-06-21', 'admin', 'admin', '2017-05-22 11:25:06', 'admin', '2017-05-23 10:33:20', 'admin', '2017-05-23 10:33:20', '1');
INSERT INTO `recordbook` VALUES ('20', '2017', '2014-02-21', '2014-06-21', 'admin', 'admin', '2017-05-22 19:21:53', 'admin', '2017-05-23 10:35:23', 'admin', '2017-05-23 10:35:23', '1');
INSERT INTO `recordbook` VALUES ('21', '2017', '2014-02-03', '2014-09-18', 'admin', 'admin', '2017-05-23 11:05:35', 'admin', '2017-05-23 11:07:11', 'admin', '2017-05-23 11:07:11', '1');
INSERT INTO `recordbook` VALUES ('22', '2017', '2014-02-21', '2014-06-21', 'admin', 'admin', '2017-05-23 11:05:52', 'admin', '2017-05-23 11:07:22', 'admin', '2017-05-23 11:07:22', '1');
INSERT INTO `recordbook` VALUES ('23', '2017', '2014-02-21', '2014-06-21', 'admin', 'admin', '2017-05-23 11:06:07', 'admin', '2017-05-23 11:07:19', 'admin', '2017-05-23 11:07:19', '1');
INSERT INTO `recordbook` VALUES ('24', '2017', '2014-02-21', '2014-06-21', 'admin', 'admin', '2017-05-23 11:06:38', 'admin', '2017-05-23 11:07:16', 'admin', '2017-05-23 11:07:16', '1');
INSERT INTO `recordbook` VALUES ('25', '2014', '2014-02-21', '2014-06-21', 'admin', 'admin', '2017-05-23 11:07:53', 'admin', '2017-05-23 11:16:26', null, null, '0');

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
INSERT INTO `topic` VALUES ('2', '选题2', '选题描述2', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('3', '选题2', '选题描述3', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('4', '选题4', '选题描述4', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('5', '选题5', '选题描述5', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('6', '选题6', '选题描述6', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('7', '选题7', '选题描述7', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('8', '选题8', '选题描述8', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('9', '选题9', '选题描述9', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('10', '选题10', '选题描述10', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('11', '选题11', '选题描述11', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('12', '选题12', '选题描述12', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('13', '选题13', '选题描述13', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');
INSERT INTO `topic` VALUES ('14', '选题14', '选题描述14', '1', '1,2,3', '3', 'teacher1', 'teacher1', '2017-04-25 15:23:01', 'teacher1', '2017-05-09 15:23:13', null, null, '0');

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
