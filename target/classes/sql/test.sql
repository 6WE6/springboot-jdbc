-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
--DROP TABLE IF EXISTS `t_user`;
--CREATE TABLE `t_user` (
--  `id` int(11) NOT NULL DEFAULT '0',
--  `name` varchar(100) DEFAULT NULL,
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE t_user cascade constraint;
CREATE TABLE t_user(
	id number(11) primary key,
	name varchar2(1000)
);
