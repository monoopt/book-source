/*
 Navicat Premium Data Transfer

 Source Server         : mysql8
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : ticket_db

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 28/06/2020 12:13:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for attachfile
-- ----------------------------
DROP TABLE IF EXISTS `attachfile`;
CREATE TABLE `attachfile`  (
  `id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `file_uuid` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `filename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `file_size` bigint(0) NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `file_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ticket_id` bigint(0) UNSIGNED NULL DEFAULT NULL,
  `original_filename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `attachfile_ibfk_1`(`ticket_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of attachfile
-- ----------------------------
INSERT INTO `attachfile` VALUES (1, '912d4bcf-7ec6-4256-a268-204e7c634a17', 'Energy-Aware Dynamic Virtual Machine consolidation for cloud center.pdf', 7716640, '2019-06-05 23:42:19', 'application/pdf', 28, NULL);
INSERT INTO `attachfile` VALUES (2, 'bbca3b43-7d38-467f-8bfb-c73c7f66681f', 'Energy-Aware Dynamic Virtual Machine consolidation for cloud center.pdf', 7716640, '2019-06-07 16:52:18', 'application/pdf', 29, NULL);
INSERT INTO `attachfile` VALUES (3, 'ab186b4b-81f7-4074-b2fe-00626e779ff9', 'Energy-Aware Dynamic Virtual Machine consolidation for cloud center.pdf', 7716640, '2019-06-07 16:55:01', 'application/pdf', 30, NULL);
INSERT INTO `attachfile` VALUES (4, 'e61b0d46-d0fd-4187-9907-9cab077f2c00', 'Energy-Aware Dynamic Virtual Machine consolidation for cloud center.pdf', 7716640, '2019-06-07 16:57:12', 'application/pdf', 31, NULL);
INSERT INTO `attachfile` VALUES (5, '39d9d914-4c87-4e79-9d48-68948bdabc06', 'Energy-Aware Dynamic Virtual Machine consolidation for cloud center.pdf', 7716640, '2019-06-07 16:59:14', 'application/pdf', 32, NULL);
INSERT INTO `attachfile` VALUES (6, '99b52813-39a9-41b4-b4f2-c5914351ab78', 'Energy-Aware Dynamic Virtual Machine consolidation for cloud center.pdf', 7716640, '2019-06-07 17:00:21', 'application/pdf', 33, NULL);
INSERT INTO `attachfile` VALUES (7, 'b3c8619a-3330-41d6-8b6e-3b5d04876e34', '电子回单_2019060500085000102012517290290024178047.pdf', 117109, '2019-06-07 17:09:41', 'application/pdf', 34, NULL);
INSERT INTO `attachfile` VALUES (8, 'cf014254-e9e1-44a6-a301-e3ede1bde8b5', '关于开展2020年IEET工程及科技教育认证申请工作的通知.pdf', 635671, '2019-06-07 17:09:41', 'application/pdf', 34, NULL);
INSERT INTO `attachfile` VALUES (9, 'db62401d-3262-47a6-b79a-7e8582e50ce2', '软工IEET自评报告书.pdf', 3166959, '2019-06-07 17:09:41', 'application/pdf', 34, NULL);
INSERT INTO `attachfile` VALUES (10, '92c59340-3fb5-421a-a069-3c0b5655b508', '1.jpg', 29760, '2019-11-30 16:15:27', 'image/jpeg', 36, NULL);
INSERT INTO `attachfile` VALUES (11, '32f1ecb2-a134-43cc-91fb-9eae7825bd65', 'IMG_1003.JPG', 4736452, '2019-12-01 19:39:50', 'image/jpeg', 40, NULL);
INSERT INTO `attachfile` VALUES (12, '5825c86f-1064-46f2-a4af-a57273835560', 'IMG_1003.JPG', 4736452, '2019-12-01 19:40:20', 'image/jpeg', 41, NULL);
INSERT INTO `attachfile` VALUES (13, '25d6bb59-7943-433d-81e1-609d21ddc125', 'IMG_1060.JPG', 2291138, '2019-12-01 19:57:01', 'image/jpeg', 46, NULL);
INSERT INTO `attachfile` VALUES (14, '2fee7aa7-1d2b-448f-9041-d9f94da3abdd', 'IMG_1007.JPG', 4226806, '2019-12-01 19:59:19', 'image/jpeg', 49, NULL);
INSERT INTO `attachfile` VALUES (15, '19bd88fa-c29b-4841-b5f4-43e56b7c9f30', '关于开展2020年IEET工程及科技教育认证申请工作的通知.pdf', 635671, '2019-12-01 20:33:53', 'application/pdf', 56, NULL);
INSERT INTO `attachfile` VALUES (16, '9c1f7341-3fe0-4e6f-bc35-118baf709ef1', 'Rplot01.pdf', 19125, '2019-12-01 22:42:15', 'application/pdf', 59, NULL);
INSERT INTO `attachfile` VALUES (17, 'f7905553-127f-4574-80e5-c077e5571497', '13.jpg', 275522, '2019-12-01 22:48:07', 'image/jpeg', 62, NULL);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 'ROLE_common');
INSERT INTO `role` VALUES (2, 'ROLE_admin');

-- ----------------------------
-- Table structure for ticket
-- ----------------------------
DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket`  (
  `id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` bigint(0) UNSIGNED NOT NULL,
  `subject` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` decimal(10, 0) NULL DEFAULT NULL,
  `ticket_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT NULL,
  `approved_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `status` int(0) NULL DEFAULT NULL,
  `body` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `update_time` timestamp(0) NULL DEFAULT NULL,
  `company_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `userId`(`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ticket
-- ----------------------------
INSERT INTO `ticket` VALUES (1, 4, '44', 44, '4', NULL, '2019-06-05 21:03:48', 2, '測試數據', NULL, NULL);
INSERT INTO `ticket` VALUES (2, 4, 'test', 0, NULL, '2019-05-20 12:36:43', NULL, 0, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (3, 3, '办公发票', 1000, '银行支票', NULL, '2019-06-06 17:21:48', 2, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (5, 9, '办公发票', 1000, '银行支票', NULL, '2019-06-06 17:16:32', 0, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (6, 7, '办公发票', 1000, '银行支票', NULL, '2019-06-09 08:52:35', 0, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (7, 4, '办公发票', 1001, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (8, 3, '办公发票', 1000, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (9, 10, '办公发票', 1001, '银行支票', NULL, '2019-11-30 16:12:48', 2, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (10, 1, '办公发票', 1001, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (11, 7, '办公发票', 1000, '银行支票', NULL, '2019-06-06 17:16:35', 0, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (12, 9, '办公发票', 1001, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (13, 10, '办公发票', 1001, '银行支票', NULL, '2019-06-06 17:13:54', 2, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (14, 6, '办公发票', 1001, '银行支票', NULL, '2019-06-06 17:21:45', 0, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (15, 3, '办公发票', 1001, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (16, 8, '办公发票', 1001, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (17, 5, '办公发票', 1000, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (18, 4, '办公发票', 1000, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (19, 2, '办公发票', 1001, '银行支票', NULL, '2019-06-07 22:05:53', 2, '测试数据', NULL, NULL);
INSERT INTO `ticket` VALUES (20, 9, '办公发票', 1001, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (21, 3, '办公发票', 1000, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (22, 4, '办公发票', 1001, '银行支票', NULL, NULL, 3, NULL, NULL, NULL);
INSERT INTO `ticket` VALUES (23, 4, '主题', NULL, '金融票据', '2019-06-03 16:08:22', NULL, NULL, '主要内容，办公用品', NULL, NULL);
INSERT INTO `ticket` VALUES (24, 4, '主题', NULL, '金融票据', '2019-06-03 16:10:44', NULL, NULL, '主要内容，办公用品', NULL, NULL);
INSERT INTO `ticket` VALUES (25, 4, 'Tracker', NULL, '银行汇票', '2019-06-05 22:36:10', '2019-06-09 08:52:16', 2, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (26, 4, 'Tracker', NULL, '银行汇票', '2019-06-05 22:37:57', NULL, 3, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (27, 4, 'Tracker', NULL, '银行汇票', '2019-06-05 22:39:44', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (28, 4, 'Tracker', NULL, '银行汇票', '2019-06-05 23:42:19', '2019-06-07 18:34:41', 2, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (29, 4, 'Tracker', NULL, '银行汇票', '2019-06-07 16:52:18', NULL, 3, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (30, 4, 'Tracker', NULL, '银行汇票', '2019-06-07 16:55:01', '2019-11-30 16:14:21', 2, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (31, 4, 'Tracker', NULL, '银行汇票', '2019-06-07 16:57:12', '2019-06-07 23:02:40', 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (32, 4, 'Tracker', NULL, '银行汇票', '2019-06-07 16:59:14', '2019-06-07 17:20:08', 2, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (33, 4, 'Tracker', NULL, '银行汇票', '2019-06-07 17:00:21', '2019-06-07 17:20:45', 2, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (34, 4, 'Tracker', NULL, '银行汇票', '2019-06-07 17:09:41', '2019-06-07 17:17:37', 2, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (35, 5, 'subje', 3334, '银行汇票', '2019-11-24 16:59:22', NULL, NULL, 'tst', NULL, NULL);
INSERT INTO `ticket` VALUES (36, 4, 'Tracker', NULL, '银行汇票', '2019-11-30 16:15:27', NULL, 3, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (37, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 17:27:29', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (38, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 17:35:45', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (39, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:37:05', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (40, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:39:50', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (41, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:40:20', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (42, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:43:13', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (43, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:45:10', '2019-12-01 20:49:17', 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (44, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:49:37', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (45, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:54:41', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (46, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:57:01', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (47, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:57:46', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (48, 4, 'Tracker000000', NULL, '银行汇票', '2019-12-01 19:58:15', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (49, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 19:59:19', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (50, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 20:01:25', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (51, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 20:05:51', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (52, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 20:09:00', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (53, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 20:19:18', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (54, 4, 'Tracker3333', NULL, '银行汇票', '2019-12-01 20:24:08', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (55, 4, '89999', NULL, '银行汇票', '2019-12-01 20:29:45', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (56, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 20:33:53', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (57, 4, 'Tracker000', NULL, '银行汇票', '2019-12-01 20:36:41', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (58, 4, 'Tracker3336000', NULL, '银行汇票', '2019-12-01 20:38:45', NULL, 0, '                                                                                                                                                                                                                                                                    购买办公用品、服务器1批，共10000元...\r\n                        666666', NULL, NULL);
INSERT INTO `ticket` VALUES (59, 4, '测试票据1', NULL, '商业汇票', '2019-12-01 22:42:15', NULL, 0, '购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (60, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 22:47:31', NULL, 3, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (61, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 22:47:40', NULL, 0, '                                                                                            购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (62, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 22:48:07', NULL, 0, '                    购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);
INSERT INTO `ticket` VALUES (63, 4, 'Tracker', NULL, '银行汇票', '2019-12-01 23:30:27', NULL, 0, '                                            购买办公用品、服务器1批，共10000元...\r\n                        ', NULL, NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT NULL,
  `register_ip` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `enable` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 283 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '$2a$10$5ooQI8dir8jv0/gCa1Six.GpzAdIPf6pMqdminZ/3ijYzivCyPlfK', 'hehw3@mail2.sysu.edu.cn6666', '2020-06-22 08:56:58', '2019-05-07 23:48:40', '3', 1);
INSERT INTO `user` VALUES (3, 'user_000', 'user_000', 'user_000@aliyun.com', NULL, '2019-05-19 21:28:20', NULL, 1);
INSERT INTO `user` VALUES (4, 'guest', '$2a$10$2Zl3IudF74NEOIH8rYd15.FvEpTI6TabH0ZWyyjpAA9Jsa7h5jfjK', 'user_001@aliyun.com', '2020-06-23 03:55:18', '2019-05-19 21:28:20', NULL, 1);
INSERT INTO `user` VALUES (5, 'user_002', 'user_002', 'user_002@aliyun.com', NULL, '2019-05-19 21:28:20', NULL, 1);
INSERT INTO `user` VALUES (6, 'user_003', 'user_003', 'user_003@aliyun.com', NULL, '2019-05-19 21:28:20', NULL, 1);
INSERT INTO `user` VALUES (8, 'user_005', 'user_005', 'user_005@aliyun.com', NULL, '2019-05-19 21:28:20', NULL, 1);
INSERT INTO `user` VALUES (9, 'user_006', 'user_006', 'user_006@aliyun.com', NULL, '2019-05-19 21:28:20', NULL, 1);
INSERT INTO `user` VALUES (10, 'user_007', 'user_007', 'user_007@aliyun.com', NULL, '2019-05-19 21:28:20', NULL, 1);
INSERT INTO `user` VALUES (11, 'user_008', 'user_008', 'user_008@aliyun.com', '2020-06-23 02:50:14', '2019-05-19 21:28:20', NULL, 1);
INSERT INTO `user` VALUES (18, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-05-19 22:14:34', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (21, 'user_001', 'user_001', 'user_001@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (22, 'user_002', 'user_002', 'user_002@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (23, 'user_003', 'user_003', 'user_003@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (24, 'user_004', 'user_004', 'user_004@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (25, 'user_005', 'user_005', 'user_005@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (26, 'user_006', 'user_006', 'user_006@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (27, 'user_007', 'user_007', 'user_007@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (28, 'user_008', 'user_008', 'user_008@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (29, 'user_009', 'user_009', 'user_009@aliyun.com', '2020-06-23 03:14:41', '2019-05-25 17:22:20', NULL, 1);
INSERT INTO `user` VALUES (31, 'user_0011', 'user_0011', 'user_0011@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (32, 'user_0012', 'user_0012', 'user_0012@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (33, 'user_0013', 'user_0013', 'user_0013@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (34, 'user_0014', 'user_0014', 'user_0014@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (35, 'user_0015', 'user_0015', 'user_0015@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (36, 'user_0016', 'user_0016', 'user_0016@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (37, 'user_0017', 'user_0017', 'user_0017@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (38, 'user_0018', 'user_0018', 'user_0018@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (39, 'user_0019', 'user_0019', 'user_0019@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (40, 'user_0020', 'user_0020', 'user_0020@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (41, 'user_0021', 'user_0021', 'user_0021@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (42, 'user_0022', 'user_0022', 'user_0022@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (43, 'user_0023', 'user_0023', 'user_0023@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (44, 'user_0024', 'user_0024', 'user_0024@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (45, 'user_0025', 'user_0025', 'user_0025@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (46, 'user_0026', 'user_0026', 'user_0026@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (47, 'user_0027', 'user_0027', 'user_0027@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (48, 'user_0028', 'user_0028', 'user_0028@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (49, 'user_0029', 'user_0029', 'user_0029@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (50, 'user_0030', 'user_0030', 'user_0030@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (51, 'user_0031', 'user_0031', 'user_0031@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (52, 'user_0032', 'user_0032', 'user_0032@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (53, 'user_0033', 'user_0033', 'user_0033@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (54, 'user_0034', 'user_0034', 'user_0034@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (55, 'user_0035', 'user_0035', 'user_0035@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (56, 'user_0036', 'user_0036', 'user_0036@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (57, 'user_0037', 'user_0037', 'user_0037@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (58, 'user_0038', 'user_0038', 'user_0038@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (59, 'user_0039', 'user_0039', 'user_0039@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (60, 'user_0040', 'user_0040', 'user_0040@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (61, 'user_0041', 'user_0041', 'user_0041@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (62, 'user_0042', 'user_0042', 'user_0042@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (63, 'user_0043', 'user_0043', 'user_0043@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (64, 'user_0044', 'user_0044', 'user_0044@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (65, 'user_0045', 'user_0045', 'user_0045@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (66, 'user_0046', 'user_0046', 'user_0046@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (67, 'user_0047', 'user_0047', 'user_0047@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (68, 'user_0048', 'user_0048', 'user_0048@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (69, 'user_0049', 'user_0049', 'user_0049@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (70, 'user_0050', 'user_0050', 'user_0050@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (71, 'user_0051', 'user_0051', 'user_0051@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (72, 'user_0052', 'user_0052', 'user_0052@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (73, 'user_0053', 'user_0053', 'user_0053@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (74, 'user_0054', 'user_0054', 'user_0054@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (75, 'user_0055', 'user_0055', 'user_0055@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (76, 'user_0056', 'user_0056', 'user_0056@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (77, 'user_0057', 'user_0057', 'user_0057@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (78, 'user_0058', 'user_0058', 'user_0058@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (79, 'user_0059', 'user_0059', 'user_0059@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (80, 'user_0060', 'user_0060', 'user_0060@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (81, 'user_0061', 'user_0061', 'user_0061@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (82, 'user_0062', 'user_0062', 'user_0062@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (83, 'user_0063', 'user_0063', 'user_0063@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (84, 'user_0064', 'user_0064', 'user_0064@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (85, 'user_0065', 'user_0065', 'user_0065@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (86, 'user_0066', 'user_0066', 'user_0066@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (87, 'user_0067', 'user_0067', 'user_0067@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (88, 'user_0068', 'user_0068', 'user_0068@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (89, 'user_0069', 'user_0069', 'user_0069@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (90, 'user_0070', 'user_0070', 'user_0070@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (91, 'user_0071', 'user_0071', 'user_0071@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (92, 'user_0072', 'user_0072', 'user_0072@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (93, 'user_0073', 'user_0073', 'user_0073@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (94, 'user_0074', 'user_0074', 'user_0074@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (95, 'user_0075', 'user_0075', 'user_0075@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (96, 'user_0076', 'user_0076', 'user_0076@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (97, 'user_0077', 'user_0077', 'user_0077@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (98, 'user_0078', 'user_0078', 'user_0078@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (99, 'user_0079', 'user_0079', 'user_0079@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (100, 'user_0080', 'user_0080', 'user_0080@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (101, 'user_0081', 'user_0081', 'user_0081@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (102, 'user_0082', 'user_0082', 'user_0082@aliyun.com', '2020-06-23 03:52:38', '2019-05-25 17:22:20', NULL, 1);
INSERT INTO `user` VALUES (103, 'user_0083', 'user_0083', 'user_0083@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (104, 'user_0084', 'user_0084', 'user_0084@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (105, 'user_0085', 'user_0085', 'user_0085@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (106, 'user_0086', 'user_0086', 'user_0086@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (107, 'user_0087', 'user_0087', 'user_0087@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (108, 'user_0088', 'user_0088', 'user_0088@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (109, 'user_0089', 'user_0089', 'user_0089@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (110, 'user_0090', 'user_0090', 'user_0090@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (111, 'user_0091', 'user_0091', 'user_0091@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (112, 'user_0092', 'user_0092', 'user_0092@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (113, 'user_0093', 'user_0093', 'user_0093@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (114, 'user_0094', 'user_0094', 'user_0094@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (115, 'user_0095', 'user_0095', 'user_0095@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (116, 'user_0096', 'user_0096', 'user_0096@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (117, 'user_0097', 'user_0097', 'user_0097@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (118, 'user_0098', 'user_0098', 'user_0098@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (119, 'user_0099', 'user_0099', 'user_0099@aliyun.com', NULL, '2019-05-25 17:22:20', NULL, NULL);
INSERT INTO `user` VALUES (121, 'user_00200', 'user_00200', 'user_00200@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (122, 'user_00201', 'user_00201', 'user_00201@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (123, 'user_00202', 'user_00202', 'user_00202@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (124, 'user_00203', 'user_00203', 'user_00203@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (125, 'user_00204', 'user_00204', 'user_00204@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (126, 'user_00205', 'user_00205', 'user_00205@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (127, 'user_00206', 'user_00206', 'user_00206@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (128, 'user_00207', 'user_00207', 'user_00207@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (129, 'user_00208', 'user_00208', 'user_00208@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (130, 'user_00209', 'user_00209', 'user_00209@aliyun.com', NULL, '2019-05-26 12:43:23', NULL, NULL);
INSERT INTO `user` VALUES (132, 'user_00200', 'user_00200', 'user_00200@aliyun.com', NULL, '2019-05-26 12:44:26', NULL, NULL);
INSERT INTO `user` VALUES (133, 'user_00201', 'user_00201', 'user_00201@aliyun.com', NULL, '2019-05-26 12:44:26', NULL, NULL);
INSERT INTO `user` VALUES (134, 'user_00202', 'user_00202', 'user_00202@aliyun.com', NULL, '2019-05-26 12:44:26', NULL, NULL);
INSERT INTO `user` VALUES (135, 'user_00203', 'user_00203', 'user_00203@aliyun.com', NULL, '2019-05-26 12:44:26', NULL, NULL);
INSERT INTO `user` VALUES (136, 'user_00204', 'user_00204', 'user_00204@aliyun.com', NULL, '2019-05-26 12:44:26', NULL, NULL);
INSERT INTO `user` VALUES (137, 'user_00205', 'user_00205', 'user_00205@aliyun.com', NULL, '2019-05-26 12:44:26', NULL, NULL);
INSERT INTO `user` VALUES (138, 'user_00206', 'user_00206', 'user_00206@aliyun.com', NULL, '2019-05-26 12:44:26', NULL, NULL);
INSERT INTO `user` VALUES (139, 'user_00207', 'user_00207', 'user_00207@aliyun.com', NULL, '2019-05-26 12:44:26', NULL, NULL);
INSERT INTO `user` VALUES (150, 'user_00208', 'user_00208', 'user_00208@aliyun.com', NULL, '2019-05-26 12:45:12', NULL, NULL);
INSERT INTO `user` VALUES (151, 'user_00209', 'user_00209', 'user_00209@aliyun.com', NULL, '2019-05-26 12:45:12', NULL, NULL);
INSERT INTO `user` VALUES (154, 'user_00302', 'user_00302', 'user_00302@aliyun.com', NULL, '2019-05-26 16:15:32', NULL, NULL);
INSERT INTO `user` VALUES (159, 'user_00307', 'user_00307', 'user_00307@aliyun.com', NULL, '2019-05-26 16:15:32', NULL, NULL);
INSERT INTO `user` VALUES (160, 'user_00308', 'user_00308', 'user_00308@aliyun.com', NULL, '2019-05-26 16:15:32', NULL, NULL);
INSERT INTO `user` VALUES (161, 'user_00309', 'user_00309', 'user_00309@aliyun.com', NULL, '2019-05-26 16:15:32', NULL, NULL);
INSERT INTO `user` VALUES (163, 'user_00301', 'user_00301', 'user_00301@aliyun.com', NULL, '2019-05-26 16:30:58', NULL, NULL);
INSERT INTO `user` VALUES (164, 'user_00302', 'user_00302', 'user_00302@aliyun.com', NULL, '2019-05-26 16:30:58', NULL, NULL);
INSERT INTO `user` VALUES (169, 'user_00307', 'user_00307', 'user_00307@aliyun.com', NULL, '2019-05-26 16:30:58', NULL, NULL);
INSERT INTO `user` VALUES (170, 'user_00308', 'user_00308', 'user_00308@aliyun.com', NULL, '2019-05-26 16:30:58', NULL, NULL);
INSERT INTO `user` VALUES (171, 'user_00309', 'user_00309', 'user_00309@aliyun.com', NULL, '2019-05-26 16:30:58', NULL, NULL);
INSERT INTO `user` VALUES (173, 'user_00301', 'user_00301', 'user_00301@aliyun.com', NULL, '2019-05-26 16:35:33', NULL, NULL);
INSERT INTO `user` VALUES (174, 'user_00302', 'user_00302', 'user_00302@aliyun.com', NULL, '2019-05-26 16:35:33', NULL, NULL);
INSERT INTO `user` VALUES (175, 'user_00303', 'user_00303', 'user_00303@aliyun.com', NULL, '2019-05-26 16:35:33', NULL, NULL);
INSERT INTO `user` VALUES (179, 'user_00307', 'user_00307', 'user_00307@aliyun.com', NULL, '2019-05-26 16:35:33', NULL, NULL);
INSERT INTO `user` VALUES (180, 'user_00308', 'user_00308', 'user_00308@aliyun.com', NULL, '2019-05-26 16:35:33', NULL, NULL);
INSERT INTO `user` VALUES (181, 'user_00309', 'user_00309', 'user_00309@aliyun.com', NULL, '2019-05-26 16:35:33', NULL, NULL);
INSERT INTO `user` VALUES (184, 'user_00302', 'user_00302', 'user_00302@aliyun.com', NULL, '2019-05-26 16:49:47', NULL, NULL);
INSERT INTO `user` VALUES (189, 'user_00307', 'user_00307', 'user_00307@aliyun.com', NULL, '2019-05-26 16:49:47', NULL, NULL);
INSERT INTO `user` VALUES (190, 'user_00308', 'user_00308', 'user_00308@aliyun.com', NULL, '2019-05-26 16:49:47', NULL, NULL);
INSERT INTO `user` VALUES (191, 'user_00309', 'user_00309', 'user_00309@aliyun.com', NULL, '2019-05-26 16:49:47', NULL, NULL);
INSERT INTO `user` VALUES (192, 'test123', '123456', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (195, 'user_00302', 'user_00302', 'user_00302@aliyun.com', NULL, '2019-05-26 17:03:45', NULL, NULL);
INSERT INTO `user` VALUES (199, 'user_00306', 'user_00306', 'user_00306@aliyun.com', NULL, '2019-05-26 17:03:45', NULL, NULL);
INSERT INTO `user` VALUES (201, 'user_00308', 'user_00308', 'user_00308@aliyun.com', NULL, '2019-05-26 17:03:45', NULL, NULL);
INSERT INTO `user` VALUES (202, 'user_00309', 'user_00309', 'user_00309@aliyun.com', NULL, '2019-05-26 17:03:45', NULL, NULL);
INSERT INTO `user` VALUES (205, 'user_00302', 'user_00302', 'user_00302@aliyun.com', NULL, '2019-05-26 17:10:16', NULL, NULL);
INSERT INTO `user` VALUES (206, 'user_00303', 'user_00303', 'user_00303@aliyun.com', NULL, '2019-05-26 17:10:16', NULL, NULL);
INSERT INTO `user` VALUES (209, 'user_00306', 'user_00306', 'user_00306@aliyun.com', NULL, '2019-05-26 17:10:16', NULL, NULL);
INSERT INTO `user` VALUES (210, 'user_00307', 'user_00307', 'user_00307@aliyun.com', NULL, '2019-05-26 17:10:16', NULL, NULL);
INSERT INTO `user` VALUES (211, 'user_00308', 'user_00308', 'user_00308@aliyun.com', NULL, '2019-05-26 17:10:16', NULL, NULL);
INSERT INTO `user` VALUES (212, 'user_00309', 'user_00309', 'user_00309@aliyun.com', NULL, '2019-05-26 17:10:16', NULL, NULL);
INSERT INTO `user` VALUES (213, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-02 16:49:57', '0:0:0:0:0:0:0:1', NULL);
INSERT INTO `user` VALUES (214, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-02 17:30:15', '0:0:0:0:0:0:0:1', NULL);
INSERT INTO `user` VALUES (215, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 19:43:11', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (216, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 19:44:31', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (217, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 19:45:20', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (218, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 19:46:56', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (219, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 19:48:11', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (220, 'Tester', NULL, 'trace@hotmail.com', NULL, '2019-06-09 20:35:39', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (221, 'gooser', NULL, 'trace@hotmail.com', NULL, '2019-06-09 20:36:20', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (222, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 20:40:52', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (223, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 20:48:51', '0:0:0:0:0:0:0:1', 0);
INSERT INTO `user` VALUES (224, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 20:59:06', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (225, 'Tracker8888', NULL, 'trace@hotmail.com', NULL, '2019-06-09 20:59:21', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (226, '44444', NULL, 'trace@hotmail.com', NULL, '2019-06-09 23:38:16', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (227, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 23:41:17', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (228, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-09 23:45:36', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (229, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-10 11:39:03', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (230, 'Tracker', NULL, 'trace@hotmail.com', NULL, '2019-06-10 13:05:10', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (241, 'tester123', '32323', 'afas@yaho.com', NULL, '2019-11-17 23:25:34', '172.23.222.2', 1);
INSERT INTO `user` VALUES (242, 'tester123000', '32323', 'afas@yaho.com', NULL, '2019-11-17 23:26:53', '172.23.222.2', 1);
INSERT INTO `user` VALUES (243, 'tester123000', '32323', 'afas@yaho.com', NULL, '2019-11-17 23:27:17', '172.23.222.2', 1);
INSERT INTO `user` VALUES (244, 'tester123000', '32323', 'afas@yaho.com', NULL, '2019-11-17 23:28:31', '172.23.222.2', 1);
INSERT INTO `user` VALUES (246, 'tester123000', '32323', 'afas@yaho.com', NULL, '2019-11-17 23:29:32', '172.23.222.2', 1);
INSERT INTO `user` VALUES (247, 'tester123000', '32323', 'afas@yaho.com', NULL, '2019-11-17 23:30:39', '172.23.222.2', 1);
INSERT INTO `user` VALUES (248, 'tester', '33', 'hehuaiwen11@yahoo.com', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (249, 'tester', '33', 'eabc@yahoo.com', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (251, 'Nicoloars', NULL, 'test@zsc.edu.cn', NULL, '2019-11-24 16:15:20', '192.2.2.2', 1);
INSERT INTO `user` VALUES (254, 'Tracker123', NULL, 'trace@hotmail.com', NULL, '2019-11-30 16:12:56', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (255, 'Junit', 'passw', 'fadf@c.ocm', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (256, 'Junit200', 'passw', 'fadf@c.ocm', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (258, 'Nicoloars', NULL, 'test@zsc.edu.cn', NULL, '2019-12-01 23:14:21', '192.2.2.2', 1);
INSERT INTO `user` VALUES (259, 'Junit', 'passw', 'fadf@c.ocm', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (264, 'Junit', 'passw', 'fadf@c.ocm', NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (266, 'he_huai_wen', '123456', 'hehw3@mail2.sysu.edu.cn', '2020-06-14 03:12:34', '2020-06-10 15:00:34', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (267, 'he_huai_wen@aliyun.com', '123456', 'ganzongp@126.com', '2020-06-10 15:20:36', '2020-06-10 15:20:36', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (277, 'he_huai_wen@aliyun.com', '123456', 'hehw3@mail2.sysu.edu.cn', '2020-06-14 03:44:05', '2020-06-13 07:53:32', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (278, 'shitou', '$2a$10$HM3gZUuvI5D/iPYqsbvwveas9UuEfB8ZpHQJpnemW6RPwm7dIflze', 'gafdasf@gamil.com', '2020-06-19 03:11:58', '2020-06-19 03:11:58', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (279, 'admin3232', '$2a$10$Gka/lYfyAlz24p44/o4zyOgILLm0GPFL209iiUPMbggvYVWoQ/c2i', 'liangshs5@mail.sysu.edu.cn', '2020-06-19 03:13:13', '2020-06-19 03:13:13', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (280, '张明', '$2a$10$5hpTNF0hsNa6lr7.Diu3x.HN8lllpsjgQH4J9rVa1rCgwcrUr6Quy', 'hehw3@mail2.sysu.edu.cn', '2020-06-20 10:12:55', '2020-06-20 10:12:55', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (281, 'shitou1', '$2a$10$24hdXF3Up9Cb4BEL57kwRuCkUXhCihHHjAzec4ZBcFZCxQe743XkG', 'longkun.guo@qlu.edu.cn', '2020-06-23 01:49:08', '2020-06-23 01:48:54', '0:0:0:0:0:0:0:1', 1);
INSERT INTO `user` VALUES (282, 'shitou2', '$2a$10$L1UXg2bdYlcmk7gcymtAGuyGyC0fjhimmYhCX1umukDLqOnHUVNja', 'hehw3@mail2.sysu.edu.cn', '2020-06-28 03:25:26', '2020-06-28 03:25:26', '0:0:0:0:0:0:0:1', 1);

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` int(0) NULL DEFAULT NULL,
  `role_id` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 70 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (6, 6, 2);
INSERT INTO `user_role` VALUES (7, 3, 2);
INSERT INTO `user_role` VALUES (8, 40, 2);
INSERT INTO `user_role` VALUES (9, 40, 2);
INSERT INTO `user_role` VALUES (10, 40, 2);
INSERT INTO `user_role` VALUES (12, 267, 2);
INSERT INTO `user_role` VALUES (51, 266, 1);
INSERT INTO `user_role` VALUES (55, 277, 1);
INSERT INTO `user_role` VALUES (56, 278, 1);
INSERT INTO `user_role` VALUES (57, 279, 2);
INSERT INTO `user_role` VALUES (58, 280, 1);
INSERT INTO `user_role` VALUES (59, 1, 2);
INSERT INTO `user_role` VALUES (61, 281, 2);
INSERT INTO `user_role` VALUES (62, 11, 2);
INSERT INTO `user_role` VALUES (65, 29, 2);
INSERT INTO `user_role` VALUES (66, 102, 1);
INSERT INTO `user_role` VALUES (68, 4, 2);
INSERT INTO `user_role` VALUES (69, 282, 2);

SET FOREIGN_KEY_CHECKS = 1;
