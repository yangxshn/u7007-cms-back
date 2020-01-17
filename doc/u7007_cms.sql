/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50720
Source Host           : 127.0.0.1:3306
Source Database       : u7007_cms

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-01-17 20:06:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for u7007_cms_focus
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_focus`;
CREATE TABLE `u7007_cms_focus` (
  `focusId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `focusImg` varchar(127) NOT NULL DEFAULT '' COMMENT '轮播图图片',
  `focusUrl` varchar(127) NOT NULL DEFAULT '' COMMENT '跳转地址',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`focusId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_focus
-- ----------------------------
INSERT INTO `u7007_cms_focus` VALUES ('1', 'http://127.0.0.1:9200/images/focus/dae2c8c045564d78945b3429600fdf60.jpg', 'https://game.bilibili.com/dwbgx/yyjly/?msource=1&source=afid_f88e6e3014ed11ea98be3e4b1d0ac9bc', '2019-12-24 22:03:24', '2019-12-24 22:03:24');
INSERT INTO `u7007_cms_focus` VALUES ('2', 'http://127.0.0.1:9200/images/focus/a3e09596572d4894a310efe488032826.jpg', 'https://www.bilibili.com/read/cv4211567?from=1002&spm_id_from=333.851.b_7265706f7274466972737431.4', '2019-12-24 22:03:46', '2019-12-24 22:03:46');
INSERT INTO `u7007_cms_focus` VALUES ('3', 'http://127.0.0.1:9200/images/focus/5c2ca8cbe4c74a978fae6292140d5490.jpg', 'https://www.bilibili.com/blackboard/activity-0UD_3RKi.html?spm_id_from=333.851.b_7265706f7274466972737431.5', '2019-12-24 22:03:56', '2019-12-24 22:03:56');

-- ----------------------------
-- Table structure for u7007_cms_goods
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_goods`;
CREATE TABLE `u7007_cms_goods` (
  `goodsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品标识',
  `goodsCode` varchar(32) NOT NULL DEFAULT '' COMMENT '商品货号',
  `title` varchar(32) NOT NULL DEFAULT '' COMMENT '商品标题',
  `summary` text NOT NULL COMMENT '摘要',
  `content` text NOT NULL COMMENT '详情',
  `clickNum` int(11) NOT NULL DEFAULT '0' COMMENT '点击次数',
  `imageUrl` varchar(127) NOT NULL DEFAULT '' COMMENT '图片地址',
  `stock` int(11) NOT NULL DEFAULT '0' COMMENT '库存',
  `sellPrice` decimal(20,2) NOT NULL DEFAULT '0.00' COMMENT '出售价格',
  `marketPrice` decimal(20,2) NOT NULL DEFAULT '0.00' COMMENT '市场价格',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`goodsId`),
  UNIQUE KEY `goodsCode` (`goodsCode`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_goods
-- ----------------------------
INSERT INTO `u7007_cms_goods` VALUES ('1', 'HW2932214405', '华为 HUAWEI Mate20 X (5G)', '7nm工艺5G旗舰芯片全面屏超大广角徕卡三摄8GB+256GB宝石蓝5G双模全网通手机 ', '周四的时候，华为正式向英国消费者带来了该公司首款 5G 智能机 —— 它就是配备了 7.2 英寸大屏的 Mate 20 X 5G 。 该机将与三星 Galaxy S10 5G 和一加 7 Pro 5G 等展开竞争，英国地区的上市时间为今年 6 月，起售价为 999 英镑(合 1279 美元 / 8800 RMB)。遗憾的是，华为暂未宣布该机在全球其它地区的上市日期。\r\n\r\n(图自：Huawei，viaCnet)\r\n\r\n配置方面，除了 7.2 英寸的屏幕，Mate 20 X 5G 还采用了华为自家的 Kirin 980 SoC、4200mAh 电池与后置三摄 —— 包括标准、长焦、以及超广角镜头。\r\n\r\n除了高达7.2英寸的显示屏外，它还采用华为的麒麟980处理器，背面配备了巨大的4,200mAh电池和三相机阵列，包括标准变焦，远摄变焦和超广角。\r\n\r\n让大家有些难以理解的是，该公司的首款 5G 智能机，竟然基于去年 10 月在国内发布的非 5G 版本的 Mate 20 X，而不是最新的 P30 Pro 。至于即将到来的 Mate X 折叠屏智能机，官方已证实会支持 5G 。\r\n\r\n据悉，英国运营商 EE、Vodafone、Three 和 O2 的消费者都将提供支持华为 Mate 20 X 5G 机型的 5G 网络。不过目前只有沃达丰已给出确切的 5G 服务启用时间。\r\n\r\n最后，在华为、三星等 Android 厂商陆续杀入 5G 市场的同时，苹果却还是少数几家未及时提供 5G 机型的大型手机制造商之一。<img class=\"large\" data-loadfunc=\"0\" src=\"https://pics7.baidu.com/feed/8435e5dde71190eff2798cfdc8a24812fcfa604b.png?token=7a773c5404c2b93eb5c2d16b13d4a3ae&amp;s=4DB0AC535654CD8E89B0B143030020F1\" data-loaded=\"0\">', '129', 'http://127.0.0.1:9200/images/goods/210cd9e97e15445880c028733244e51f.jpg', '100', '3999.00', '4399.00', '2020-01-09 20:42:54', '2020-01-09 20:42:54');
INSERT INTO `u7007_cms_goods` VALUES ('2', 'SX2932214404', '三星 SAMSUNG', '三星 SAMSUNG 心系天下 W20 5G手机（SM-W2020）折叠屏 皓月白 12GB+512GB ', '三星 SAMSUNG 心系天下 W20 5G手机（SM-W2020）折叠屏 皓月白 12GB+512GB ', '2', 'http://127.0.0.1:9200/images/goods/142eb8d628cf42189571a9457330b3d4.jpg', '100', '18999.00', '19999.00', '2020-01-09 21:22:56', '2020-01-09 21:22:56');
INSERT INTO `u7007_cms_goods` VALUES ('3', 'XM2932214403', '小米红米Redmi充电宝', '小米红米Redmi充电宝20000mAh大容量快充版移动电源 Redmi充电宝 20000mAh 快充版', '小米红米Redmi充电宝20000mAh大容量快充版移动电源 Redmi充电宝 20000mAh 快充版', '22', 'http://127.0.0.1:9200/images/goods/08474a0dd3ba4c79ab13e8aee7915231.jpg', '99', '97.99', '109.00', '2020-01-09 21:37:32', '2020-01-09 21:37:32');
INSERT INTO `u7007_cms_goods` VALUES ('4', 'WX2932214402', '微星（MSI）', ' 微星（MSI）魔龙 GeForce GTX 1650 SUPER GAMING X 4GD6 1650S旗舰款 电竞游戏台式电脑独立显卡 ', ' 微星（MSI）魔龙 GeForce GTX 1650 SUPER GAMING X 4GD6 1650S旗舰款 电竞游戏台式电脑独立显卡 ', '3', 'http://127.0.0.1:9200/images/goods/241615b90a9c48c6bddad3ea5689c567.jpg', '70', '1449.00', '1499.00', '2020-01-09 21:43:48', '2020-01-09 21:43:48');

-- ----------------------------
-- Table structure for u7007_cms_goods_comment
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_goods_comment`;
CREATE TABLE `u7007_cms_goods_comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
  `goodsId` int(11) NOT NULL DEFAULT '0' COMMENT '商品标识',
  `content` varchar(125) NOT NULL DEFAULT '' COMMENT '评论内容',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_goods_comment
-- ----------------------------
INSERT INTO `u7007_cms_goods_comment` VALUES ('23', 'test1', '1', '去', '2020-01-11 22:36:44', '2020-01-11 22:36:44');

-- ----------------------------
-- Table structure for u7007_cms_goods_thumbnail
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_goods_thumbnail`;
CREATE TABLE `u7007_cms_goods_thumbnail` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '缩略图标识',
  `goodsId` int(11) NOT NULL DEFAULT '0' COMMENT '商品标识',
  `src` varchar(127) NOT NULL DEFAULT '' COMMENT '地址',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_goods_thumbnail
-- ----------------------------
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('6', '1', 'http://127.0.0.1:9200/images/goods/8d51b73635714d6ca31c773d02e3ab61.jpg', '2020-01-09 20:49:52', '2020-01-09 20:49:52');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('7', '1', 'http://127.0.0.1:9200/images/goods/703bed1ccb3448918d9db0de3dfba6f4.jpg', '2020-01-09 20:50:10', '2020-01-09 20:50:10');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('8', '1', 'http://127.0.0.1:9200/images/goods/506563470a7d4af3aa956e4436d04c1f.jpg', '2020-01-09 20:50:12', '2020-01-09 20:50:12');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('9', '1', 'http://127.0.0.1:9200/images/goods/ef5b9db9471d48ca93c03c5080048469.jpg', '2020-01-09 20:50:15', '2020-01-09 20:50:15');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('10', '1', 'http://127.0.0.1:9200/images/goods/dfaec5866d904b07a37d2fc51f8818fd.jpg', '2020-01-09 20:50:19', '2020-01-09 20:50:19');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('11', '1', 'http://127.0.0.1:9200/images/goods/7053b6c685374e1db8a84a4ab5667544.jpg', '2020-01-09 20:50:20', '2020-01-09 20:50:20');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('12', '2', '', '2020-01-09 21:27:56', '2020-01-09 21:27:56');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('13', '2', '', '2020-01-09 21:28:02', '2020-01-09 21:28:02');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('14', '2', '', '2020-01-09 21:28:05', '2020-01-09 21:28:05');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('15', '2', '', '2020-01-09 21:28:08', '2020-01-09 21:28:08');
INSERT INTO `u7007_cms_goods_thumbnail` VALUES ('16', '2', '', '2020-01-09 21:28:12', '2020-01-09 21:28:12');

-- ----------------------------
-- Table structure for u7007_cms_image
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_image`;
CREATE TABLE `u7007_cms_image` (
  `imageId` int(11) NOT NULL AUTO_INCREMENT COMMENT '图片标识',
  `catId` int(11) NOT NULL DEFAULT '0' COMMENT '分类标识',
  `title` varchar(32) NOT NULL DEFAULT '' COMMENT '标题',
  `imageUrl` varchar(127) NOT NULL DEFAULT '' COMMENT '图片地址',
  `summary` text NOT NULL COMMENT '摘要',
  `content` text NOT NULL COMMENT '详情',
  `clickNum` int(11) NOT NULL DEFAULT '0' COMMENT '点击次数',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`imageId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_image
-- ----------------------------
INSERT INTO `u7007_cms_image` VALUES ('1', '1', '无问东西', 'http://127.0.0.1:9200/images/images/3f1eb7fc9e594472b2d78370b6c66375.jpg', '设计的温度在于设计师的情感融入，在于他们对职责的坚守和对现实束缚的不妥协。设计是进程，而非一个终结的状态，需要被连续看待和循序渐进地体味。 ', '杭州的西溪路傍山沿河，行走在其间，不乏遇见年轻人骑着单车的飒爽背影，而路边随遇而安的日料小馆，又平添一份乡间野趣。然而，街角处拐一个弯，当这座庞大的玻璃大楼映入眼帘之时，你立刻会为它蜿蜒、曲折的造型所惊叹。这栋名为阿里中心杭州Z空间的新大楼，是“虚拟王国”阿里巴巴在大本营杭州的新手笔，它将互联网的活力新风吹进如画般优美的西溪，也用一座新地标建筑，回馈。\r\n\r\n建于1943年的事务所有着丰富的地标性建筑设计经验，曾与世界上诸多顶尖的公司合作，作品包括三星的美国总部、西雅图的比尔与梅林达・盖茨基金会、亚马逊总部综合体、深圳的腾讯滨海大厦等等。这一次为阿里巴巴服务，可谓又一次的强强联手！NBBJ的合伙人Robert Mankin谈起这次合作，无不自豪地说:“NBBJ之所以被阿里巴巴选定来设计新的大楼，主要基于我们强大的设计、创新能力，特别是我们积累的为科技公司设计的好声誉。”', '74', '2020-01-06 23:24:27', '2020-01-06 23:24:27');
INSERT INTO `u7007_cms_image` VALUES ('2', '2', 'Mike Kelley：俯拍视角展现美国繁忙的机场', 'http://127.0.0.1:9200/images/images/2099b7bf779d45f3b8208f642811aa64.jpg', '曾因创作了“百架飞机同时起飞”超现实主义摄影作品而名噪一时的摄影师Mike Kelley近日重操旧业，再度将镜头对准了美国机场。', '曾因创作了“百架飞机同时起飞”超现实主义摄影作品而名噪一时的摄影师Mike Kelley近日重操旧业，再度将镜头对准了美国机场。不过这次他租用了一架直升机以全俯拍的方式来拍摄洛杉矶国际机场、西雅图波音机场、南加州物流机场等多个机场以及用于停放退休飞机的“飞机墓地”。尽管拍摄方式并不复杂，但这组照片仍可谓非常难得，要知道并不是任何人都能够随心所欲地在飞机场上空进行拍摄的。这都多亏了摄影师Mike Kelley与各机场建立了“铁哥们儿”的关系才取得了在机场上空拍摄的权限，并与机场合作拍摄市场营销活动照片。', '38', '2020-01-07 20:23:21', '2020-01-07 20:23:21');
INSERT INTO `u7007_cms_image` VALUES ('3', '3', '赵丽颖扎马尾拍写真 托腮浅笑又仙又美', 'http://127.0.0.1:9200/images/images/5a0d97ce14334b7a86c9dbd9fb88e7d1.jpg', '2020年1月6日，上海，赵丽颖为某活动拍摄写真。她扎高马尾俏皮减龄，穿淡雅露肩纱裙化身冰雪奇缘的艾莎又仙又美，秀出锁骨及“A4腰”身材完美，托腮浅笑状态绝佳娇俏可人。 ', '2020年1月6日，上海，赵丽颖为某活动拍摄写真。她扎高马尾俏皮减龄，穿淡雅露肩纱裙化身冰雪奇缘的艾莎又仙又美，秀出锁骨及“A4腰”身材完美，托腮浅笑状态绝佳娇俏可人。', '1', '2020-01-07 20:29:35', '2020-01-07 20:29:35');
INSERT INTO `u7007_cms_image` VALUES ('4', '1', '家居生活小妙招?家居生活技巧?', 'http://127.0.0.1:9200/images/images/6d6443526ade4d1fa8b94778e1180af4.jpg', '家居生活小妙招越来越多，所以人们的使用方法也越来越多，对于一些不能用正规方法解决的家居问题，小妙招是可以轻松解决的，这也是为什么越来越多的人开始学习这些妙招的方法，有人知道其中的几个，但是很多人还是一无所知，这个时候我们还是跟随小编学习一下家居生活小妙招？家居生活技巧的知识吧。', '在日常生活中，大家会遇到一些很小的问题，处理起来非常的麻烦，所以今天特地给大家推荐几个家居小技巧，让大家不至于为那些小问题所困扰。\r\n\r\n　　浴室的瓷砖几乎每天都会和水汽接触，发霉是经常的事，而且清理完之后没过多久又会发霉。这时，只要拿蜡烛涂在在瓷砖的缝隙里就可以了。因为蜡烛有防水气的作用，所以就可以预防瓷砖发霉了。即使是偶尔发了一点霉，只要擦干净在涂上蜡烛就好了。\n\n作者：家居生活手册\n链接：https://www.jianshu.com/p/f1503f599519\n来源：简书\n著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。', '0', '2020-01-07 21:05:25', '2020-01-07 21:05:25');
INSERT INTO `u7007_cms_image` VALUES ('5', '1', '智能家居生活?智能家居生活的特色产品?', 'http://127.0.0.1:9200/images/images/f4f75aa362f44905a81ca8d437264956.jpg', '智能家居是未来社会的一个发展方向，也是目前大众都很感兴趣的一种科技产品，但是对于什么是智能家居生活，智能家居生活的特色产品都有哪些，也是很多人不了解的。下面我们就来了解一下智能家居生活的概念并且对智能家居生活的特色产品来做一些了解和认识。', '在日常生活中，大家会遇到一些很小的问题，处理起来非常的麻烦，所以今天特地给大家推荐几个家居小技巧，让大家不至于为那些小问题所困扰。\r\n\r\n　　浴室的瓷砖几乎每天都会和水汽接触，发霉是经常的事，而且清理完之后没过多久又会发霉。这时，只要拿蜡烛涂在在瓷砖的缝隙里就可以了。因为蜡烛有防水气的作用，所以就可以预防瓷砖发霉了。即使是偶尔发了一点霉，只要擦干净在涂上蜡烛就好了。\n\n作者：家居生活手册\n链接：https://www.jianshu.com/p/f1503f599519\n来源：简书\n著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。', '0', '2020-01-07 21:06:21', '2020-01-07 21:06:21');
INSERT INTO `u7007_cms_image` VALUES ('6', '1', '灯饰搭配如何让家居生活熠熠生辉', 'http://127.0.0.1:9200/images/images/7fa3bf0943fd43c39c06cae249b6f769.jpg', '就像咖啡厅的柔和灯光代表了小资情怀，一个家的格调和品味，也能通过灯光来体现。同样参数的光源，装在哪、怎么装，甚至用什么材料的灯罩，都会产生完全不同的灯光效果，烘托出完全不同的气氛。因此，装修时要根据每个空间的需求，设计不同的灯', '在日常生活中，大家会遇到一些很小的问题，处理起来非常的麻烦，所以今天特地给大家推荐几个家居小技巧，让大家不至于为那些小问题所困扰。\r\n\r\n　　浴室的瓷砖几乎每天都会和水汽接触，发霉是经常的事，而且清理完之后没过多久又会发霉。这时，只要拿蜡烛涂在在瓷砖的缝隙里就可以了。因为蜡烛有防水气的作用，所以就可以预防瓷砖发霉了。即使是偶尔发了一点霉，只要擦干净在涂上蜡烛就好了。\n\n作者：家居生活手册\n链接：https://www.jianshu.com/p/f1503f599519\n来源：简书\n著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。', '0', '2020-01-07 21:08:28', '2020-01-07 21:08:28');

-- ----------------------------
-- Table structure for u7007_cms_image_category
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_image_category`;
CREATE TABLE `u7007_cms_image_category` (
  `catId` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类标识',
  `title` varchar(11) NOT NULL DEFAULT '' COMMENT '标题',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`catId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_image_category
-- ----------------------------
INSERT INTO `u7007_cms_image_category` VALUES ('1', '家居生活', '2020-01-06 21:42:14', '2020-01-06 21:42:14');
INSERT INTO `u7007_cms_image_category` VALUES ('2', '摄影设计', '2020-01-06 21:42:29', '2020-01-06 21:42:29');
INSERT INTO `u7007_cms_image_category` VALUES ('3', '明星美女', '2020-01-06 21:53:17', '2020-01-06 21:53:17');
INSERT INTO `u7007_cms_image_category` VALUES ('4', '摄影器材', '2020-01-06 22:05:17', '2020-01-06 22:05:17');
INSERT INTO `u7007_cms_image_category` VALUES ('5', '明星写真', '2020-01-06 22:05:25', '2020-01-06 22:05:25');
INSERT INTO `u7007_cms_image_category` VALUES ('6', '清纯甜美', '2020-01-06 22:05:35', '2020-01-06 22:05:35');
INSERT INTO `u7007_cms_image_category` VALUES ('7', '古典美女', '2020-01-06 22:05:43', '2020-01-06 22:05:43');

-- ----------------------------
-- Table structure for u7007_cms_image_comment
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_image_comment`;
CREATE TABLE `u7007_cms_image_comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
  `imageId` int(11) NOT NULL DEFAULT '0' COMMENT '新闻标识',
  `content` varchar(125) NOT NULL DEFAULT '' COMMENT '评论内容',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_image_comment
-- ----------------------------
INSERT INTO `u7007_cms_image_comment` VALUES ('19', 'test1', '1', 'HAHA', '2020-01-07 23:10:30', '2020-01-07 23:10:30');
INSERT INTO `u7007_cms_image_comment` VALUES ('20', 'test1', '1', '吳嗚嗚', '2020-01-07 23:16:52', '2020-01-07 23:16:52');
INSERT INTO `u7007_cms_image_comment` VALUES ('21', 'test1', '2', '666', '2020-01-08 00:28:11', '2020-01-08 00:28:11');
INSERT INTO `u7007_cms_image_comment` VALUES ('22', 'test1', '2', '吴吴吴', '2020-01-08 22:06:56', '2020-01-08 22:06:56');

-- ----------------------------
-- Table structure for u7007_cms_image_thumbnail
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_image_thumbnail`;
CREATE TABLE `u7007_cms_image_thumbnail` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '缩略图标识',
  `imageId` int(11) NOT NULL DEFAULT '0' COMMENT '图片标识',
  `src` varchar(127) NOT NULL DEFAULT '' COMMENT '地址',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_image_thumbnail
-- ----------------------------
INSERT INTO `u7007_cms_image_thumbnail` VALUES ('1', '2', 'http://127.0.0.1:9200/images/images/2099b7bf779d45f3b8208f642811aa64.jpg', '2020-01-08 00:16:24', '2020-01-08 00:16:24');
INSERT INTO `u7007_cms_image_thumbnail` VALUES ('2', '2', 'http://127.0.0.1:9200/images/images/2099b7bf779d45f3b8208f642811aa64.jpg', '2020-01-08 00:16:29', '2020-01-08 00:16:29');
INSERT INTO `u7007_cms_image_thumbnail` VALUES ('3', '2', 'http://127.0.0.1:9200/images/images/2099b7bf779d45f3b8208f642811aa64.jpg', '2020-01-08 00:16:34', '2020-01-08 00:16:34');
INSERT INTO `u7007_cms_image_thumbnail` VALUES ('4', '2', 'http://127.0.0.1:9200/images/images/2099b7bf779d45f3b8208f642811aa64.jpg', '2020-01-08 00:16:38', '2020-01-08 00:16:38');
INSERT INTO `u7007_cms_image_thumbnail` VALUES ('5', '2', 'http://127.0.0.1:9200/images/images/2099b7bf779d45f3b8208f642811aa64.jpg', '2020-01-08 00:16:41', '2020-01-08 00:16:41');

-- ----------------------------
-- Table structure for u7007_cms_news
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_news`;
CREATE TABLE `u7007_cms_news` (
  `newsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '新闻标识',
  `title` varchar(127) NOT NULL DEFAULT '' COMMENT '标题',
  `newsImg` varchar(127) NOT NULL DEFAULT '' COMMENT '新闻图片',
  `clickNum` bigint(20) NOT NULL DEFAULT '0' COMMENT '点击数量',
  `details` text NOT NULL COMMENT '详情',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`newsId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_news
-- ----------------------------
INSERT INTO `u7007_cms_news` VALUES ('1', '看2019年习主席都去了哪儿？', 'http://127.0.0.1:9200/images/news/56e4c6dbb44e4233a4ba1dc1d34b7d9e.jpg', '23', '<p>　　习近平主席在2020年新年贺词中说，一年来，他去了不少地方。小编发现，过去一年，除北京外，习主席在国内到了10个省区市和澳门特别行政区，国外出访则涉及三大洲的13个国家。快戳短视频《2019年，习主席都去了哪儿》，看看习主席离你最近的时候在哪里！</p>', '2020-01-02 21:15:41', '2020-01-02 21:15:41');
INSERT INTO `u7007_cms_news` VALUES ('2', '2020年 请收好这些民生大礼包', 'http://127.0.0.1:9200/images/news/ad0212ec60404d57bce9b97354f963e3.jpg', '34', '<div class=\"item-wrap\"><div class=\"article is-firefox\" id=\"article\" data-islow-browser=\"0\"><div class=\"article-content\"><p><span class=\"bjh-p\">2020年将是收获的一年，改革成果逐步落地，一大批与民生息息相关的新政策法规即将实施。一起看看哪条与你相关。</span></p><p><span class=\"bjh-p\"><span class=\"bjh-strong\">关税调整惠及你我生活</span></span></p><p><span class=\"bjh-p\">从1月1日起，中国将对850余项商品实施低于最惠国税率的进口暂定税率。这些商品中，有不少都涉及到普通民众的日常生活。比如，新增或降低冻猪肉、冷冻鳄梨、非冷冻橙汁等商品进口暂定税率；对用于治疗哮喘的生物碱类药品和生产新型糖尿病治疗药品的原料，实施零关税等。</span></p><p><span class=\"bjh-p\"><span class=\"bjh-strong\">新版国家医保药品目录启用</span></span></p><div class=\"img-container\"><img class=\"large\" data-loadfunc=\"0\" src=\"http://127.0.0.1:9200/images/news/ad0212ec60404d57bce9b97354f963e3.jpg\" data-loaded=\"0\"></div><p><span class=\"bjh-p\">从1月1日起，新版国家医保药品目录正式启用，97个药品经过谈判进入医保目录。此外，第二批国家组织药品集中采购和使用也已启动，预计2020年4月全国患者将用上第二批国家集中采购中选药品。</span></p><p><span class=\"bjh-p\"><span class=\"bjh-strong\">居民养老再添保障</span></span></p><div class=\"img-container\"><img class=\"large\" data-loadfunc=\"0\" src=\"http://127.0.0.1:9200/images/news/ad0212ec60404d57bce9b97354f963e3.jpg\" data-loaded=\"0\"></div><p><span class=\"bjh-p\">2020年，城镇职工和城乡居民基本养老保险参保率将达到90%。35%以上的二级以上综合医院设立老年病科。全国县级以上城市至少有一所老年大学。90%的街道和乡镇建立老年人基层体育组织，城乡社区普遍建立老年人健身活动站点和体育团队。</span></p><p><span class=\"bjh-p\"><span class=\"bjh-strong\">2020年说走就走更方便</span></span></p><div class=\"img-container\"><img class=\"large\" data-loadfunc=\"0\" src=\"http://127.0.0.1:9200/images/news/ad0212ec60404d57bce9b97354f963e3.jpg\" data-loaded=\"0\"></div><p><span class=\"bjh-p\">2020年，中国高铁网也将织得更密。预计将有京沈高铁、京雄高铁等数十条线路或将开通。</span></p><p><span class=\"bjh-p\">2020年，预计新增通客车建制村将超过9400个，其中贫困地区超过5800个，24个省份实现所有具备条件的乡镇、建制村通客车。</span></p></div><audio height=\"0\" width=\"0\" id=\"musicAudio\" data-play-index=\"\"><source></audio></div></div>', '2020-01-02 21:17:27', '2020-01-02 21:17:27');

-- ----------------------------
-- Table structure for u7007_cms_news_comment
-- ----------------------------
DROP TABLE IF EXISTS `u7007_cms_news_comment`;
CREATE TABLE `u7007_cms_news_comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
  `newsId` int(11) NOT NULL DEFAULT '0' COMMENT '新闻标识',
  `content` varchar(125) NOT NULL DEFAULT '' COMMENT '评论内容',
  `createTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of u7007_cms_news_comment
-- ----------------------------
INSERT INTO `u7007_cms_news_comment` VALUES ('1', 'test1', '1', '哈哈哈', '2020-01-05 18:58:28', '2020-01-05 18:58:28');
INSERT INTO `u7007_cms_news_comment` VALUES ('2', 'test1', '1', '你很六啊', '2020-01-05 18:58:39', '2020-01-05 18:58:39');
INSERT INTO `u7007_cms_news_comment` VALUES ('3', 'test1', '1', '遥远的你在哪', '2020-01-05 18:59:03', '2020-01-05 18:59:03');
INSERT INTO `u7007_cms_news_comment` VALUES ('4', 'test1', '1', '等待遥远的你', '2020-01-05 18:58:28', '2020-01-05 18:58:28');
INSERT INTO `u7007_cms_news_comment` VALUES ('5', 'test1', '1', '无所无能', '2020-01-05 18:58:39', '2020-01-05 18:58:39');
INSERT INTO `u7007_cms_news_comment` VALUES ('6', 'test1', '1', '卡哇伊', '2020-01-05 18:59:03', '2020-01-05 18:59:03');
INSERT INTO `u7007_cms_news_comment` VALUES ('7', 'test1', '1', '呵呵额和', '2020-01-05 18:58:28', '2020-01-05 18:58:28');
INSERT INTO `u7007_cms_news_comment` VALUES ('8', 'test1', '1', '你子啊', '2020-01-05 18:58:39', '2020-01-05 18:58:39');
INSERT INTO `u7007_cms_news_comment` VALUES ('9', 'test1', '1', '心爱的奥迪', '2020-01-05 18:59:03', '2020-01-05 18:59:03');
INSERT INTO `u7007_cms_news_comment` VALUES ('10', 'test1', '1', '大阿斯顿啊啊的', '2020-01-05 18:58:28', '2020-01-05 18:58:28');
INSERT INTO `u7007_cms_news_comment` VALUES ('11', 'test1', '1', '多发点', '2020-01-05 18:59:03', '2020-01-05 18:59:03');
INSERT INTO `u7007_cms_news_comment` VALUES ('12', 'test1', '1', '大大撒 ', '2020-01-05 18:58:39', '2020-01-05 18:58:39');
INSERT INTO `u7007_cms_news_comment` VALUES ('13', 'test1', '1', '1', '2020-01-05 23:49:35', '2020-01-05 23:49:35');
INSERT INTO `u7007_cms_news_comment` VALUES ('14', 'test1', '2', '小姐姐真漂亮', '2020-01-05 23:52:31', '2020-01-05 23:52:31');
INSERT INTO `u7007_cms_news_comment` VALUES ('15', 'test1', '2', '成功了，哈哈哈', '2020-01-05 23:52:42', '2020-01-05 23:52:42');
INSERT INTO `u7007_cms_news_comment` VALUES ('16', 'test1', '2', '给我三年时间', '2020-01-05 23:52:54', '2020-01-05 23:52:54');
INSERT INTO `u7007_cms_news_comment` VALUES ('17', 'test1', '2', '还房贷', '2020-01-05 23:52:59', '2020-01-05 23:52:59');
INSERT INTO `u7007_cms_news_comment` VALUES ('18', 'test1', '2', '买车', '2020-01-05 23:53:03', '2020-01-05 23:53:03');
INSERT INTO `u7007_cms_news_comment` VALUES ('19', 'test1', '2', '666', '2020-01-08 22:05:48', '2020-01-08 22:05:48');
