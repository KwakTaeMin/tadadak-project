CREATE TABLE `user` (
        `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '유저 고유 번호 PK',
        `email` varchar(200) NOT NULL COMMENT '유저 Email',
        `role` varchar (50) NOT NULL COMMENT '유저 권한',
        `nick_name` varchar(200) NOT NULL DEFAULT '1' COMMENT '유저 이름',
        `picture` varchar(200) NOT NULL DEFAULT '1' COMMENT '유저 사진',
        `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '생성일',
        `modified_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '변경일',
        PRIMARY KEY (`id`),
        UNIQUE KEY `uk_user` (`id`,`email`),
        KEY `email_key` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='유저 계정 정보';