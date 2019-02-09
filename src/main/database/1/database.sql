DROP TABLE IF EXISTS `t_config`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_config` (
  `name` varchar(64) NOT NULL COMMENT '配置项key',
  `prop_value` varchar(255) NOT NULL DEFAULT '' COMMENT '配置项的value',
  `note` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  UNIQUE KEY `idx_config_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='配置表';

LOCK TABLES `t_config` WRITE;
INSERT INTO `t_config` VALUES ('greet','hello dubbo','');
UNLOCK TABLES;

DROP TABLE IF EXISTS `t_users`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `t_users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  `email` varchar(128) DEFAULT NULL,
  `home_url` varchar(255) DEFAULT NULL,
  `screen_name` varchar(128) DEFAULT NULL,
  `created` int(11) NOT NULL,
  `activated` int(11) DEFAULT NULL,
  `logged` int(11) DEFAULT NULL,
  `group_name` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uk_name` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;