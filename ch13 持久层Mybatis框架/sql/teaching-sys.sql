/*
 Navicat MySQL Data Transfer

 Source Server         : teacher
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : testguest

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 10/12/2020 14:10:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `courser_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `credit` int NULL DEFAULT NULL,
  `semester` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teacher_id` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, 'JAVA语言程序设计', 4, '2019-2020-2', 2);
INSERT INTO `course` VALUES (2, '数字逻辑设计及应用', 4, '2019-2020-2', 5);
INSERT INTO `course` VALUES (3, '思政课社会实践', 2, '2019-2020-2', 4);
INSERT INTO `course` VALUES (4, '体育III', 2, '2019-2020-2', 3);
INSERT INTO `course` VALUES (5, '创新创业实践', 1, '2019-2020-2', 1);
INSERT INTO `course` VALUES (6, '数据结构', 4, '2019-2020-1', 7);
INSERT INTO `course` VALUES (7, '电路与模拟电子技术', 3, '2019-2020-1', 10);
INSERT INTO `course` VALUES (8, '数据库原理与应用', 4, '2019-2020-1', 9);
INSERT INTO `course` VALUES (9, '计算机网络基础', 4, '2019-2020-1', 8);
INSERT INTO `course` VALUES (10, '马克思主义基本原理', 3, '2019-2020-1', 6);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `student_no` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `enroll_time` int NULL DEFAULT NULL,
  `home_address` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `class_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` tinyint NULL DEFAULT NULL,
  `birthday` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '20180302031', '李婷', 2018, '广东省中山市', '计算机A班', 20, '2000-08-27 00:00:00');
INSERT INTO `student` VALUES (2, '20180403001', '张晓', 2018, '广东省深圳市', '计算机M班', 20, '2000-04-23 00:00:00');
INSERT INTO `student` VALUES (3, '20180301032', '魏延', 2018, '江苏省南京市', '计算机K班', 21, '1999-11-21 00:00:00');
INSERT INTO `student` VALUES (4, '20180202021', '张晓丽', 2018, '广东省中山市', '计算机C班', 19, '2000-12-21 00:00:00');
INSERT INTO `student` VALUES (5, '20180301039', '李小龙', 2018, '广东省汕头市', '计算机L班', 20, '2000-03-11 00:00:00');
INSERT INTO `student` VALUES (6, '20180401033', '郭小波', 2018, '广东省揭阳市', '计算机K班', 19, '2001-01-01 00:00:00');
INSERT INTO `student` VALUES (7, '20180403022', '李丽婷', 2018, '广东省中山市', '计算机M班', 21, '1999-12-09 00:00:00');
INSERT INTO `student` VALUES (8, '20180503044', '胡静怡', 2018, '湖北省黄冈市', '计算机B班', 20, '2000-05-29 00:00:00');
INSERT INTO `student` VALUES (9, '20180402021', '何冰', 2018, '北京市', '计算机A班', 20, '2000-01-01 00:00:00');
INSERT INTO `student` VALUES (10, '20180403046', '胡晶晶', 2018, '广西省桂林市', '计算机C班', 20, '2000-04-05 00:00:00');

-- ----------------------------
-- Table structure for student_course
-- ----------------------------
DROP TABLE IF EXISTS `student_course`;
CREATE TABLE `student_course`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `student_id` bigint NULL DEFAULT NULL,
  `course_id` bigint NULL DEFAULT NULL,
  `score` decimal(10, 0) NULL DEFAULT NULL,
  `status` tinyint NULL DEFAULT NULL,
  `course_weektime` tinyint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_course
-- ----------------------------
INSERT INTO `student_course` VALUES (1, 20180302031, 2, 88, 1, 36);
INSERT INTO `student_course` VALUES (2, 20180403001, 4, 67, 1, 48);
INSERT INTO `student_course` VALUES (3, 20180301032, 10, 93, 1, 48);
INSERT INTO `student_course` VALUES (4, 20180202021, 8, 96, 1, 64);
INSERT INTO `student_course` VALUES (5, 20180301039, 5, 73, 1, 36);
INSERT INTO `student_course` VALUES (6, 20180401033, 3, 88, 1, 64);
INSERT INTO `student_course` VALUES (7, 20180403022, 7, 77, 1, 64);
INSERT INTO `student_course` VALUES (8, 20180503044, 9, 59, 0, 48);
INSERT INTO `student_course` VALUES (9, 20180402021, 6, 61, 1, 64);
INSERT INTO `student_course` VALUES (10, 20180403046, 1, 99, 1, 36);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `office` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cellphone` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '胡海冰', '教授', 43, '743674646@qq.com', '13158674856');
INSERT INTO `teacher` VALUES (2, '董欣怡', '副教授', 36, '185767944@qq.com', '13564857485');
INSERT INTO `teacher` VALUES (3, '何剑锋', '教师', 55, 'hr95214827liaodao@163.com', '18643758675');
INSERT INTO `teacher` VALUES (4, '林展成', '教师', 37, '64858311@qq.com', '17945637455');
INSERT INTO `teacher` VALUES (5, '孙鹏', '教师', 57, 'oko7190962ta@163.com', '15836475823');
INSERT INTO `teacher` VALUES (6, '蔡敏纯', '教师', 45, 'sojc9545341shansi@163.com', '16437584654');
INSERT INTO `teacher` VALUES (7, '梁耀辉', '教师', 44, 'zhangxindeailian4@163.com', '13234875698');
INSERT INTO `teacher` VALUES (8, '罗江洪', '教师', 47, '965310623@qq.com', '13646978034');
INSERT INTO `teacher` VALUES (9, '杨子风', '教师', 38, '10374565@163.com', '15623457486');
INSERT INTO `teacher` VALUES (10, '徐育明', '教师', 45, '4758375@qq.com', '13154678987');

SET FOREIGN_KEY_CHECKS = 1;
