use qm_admin_db;

-- 货币表
drop table if exists trm_currency_t;
CREATE TABLE trm_currency_t (
    currency_id INT AUTO_INCREMENT PRIMARY KEY,               -- 货币ID，自增主键
    currency_code VARCHAR(10) NOT NULL UNIQUE,                -- 货币编码，ISO 货币代码，唯一
    currency_name VARCHAR(50) NOT NULL,                       -- 货币名称
    description VARCHAR(255),                                 -- 货币描述
    amount_precision INT,                                     -- 金额精度
    rate_precision INT,                                       -- 汇率精度
    rounding_method VARCHAR(20),                              -- 圆整方式
    currency_holidays VARCHAR(255),                           -- 货币节假日，记录周几是节假日
    delete_flag CHAR(1) DEFAULT 'N',                          -- 删除标记，默认 'N'
    creation_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP, -- 创建时间，默认当前时间
    created_by BIGINT NOT NULL DEFAULT -1,                     -- 创建者ID，默认 -1
    last_update_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 最后更新时间
    last_updated_by BIGINT NOT NULL DEFAULT -1                -- 最后更新者ID，默认 -1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

