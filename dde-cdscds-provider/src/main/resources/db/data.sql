DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product(id varchar(32) unsigned not null primary key,name varchar(32),price int,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO product(id, name, price, tenant_id, created_by, updated_by, created_at, updated_at, dr) VALUES ('1', '苹果', 20, null, null, null, null, null, 0),
('2', '梨', 10, null, null ,null, null, null, 0),
('3', '桃子', 123, null, null ,null, null, null, 0),
('4', '香蕉', 11, null, null ,null, null, null, 0),
('5', '猕猴桃', 50, null, null ,null, null, null, 0),
('6', '桔子', 33, null, null ,null, null, null, 0),
('7', '菠萝', 90, null, null ,null, null, null, 0),
('8', '芒果', 766, null, null ,null, null, null, 0),
('9', '红枣', 29, null, null ,null, null, null, 0),
('10', '榴莲', 990, null, null ,null, null, null, 0),
('11', '柚子', 291, null, null ,null, null, null, 0),
('12', '小番茄', 200, null, null ,null, null, null, 0);
CREATE TABLE IF NOT EXISTS pc_wx_checkin_activity_info(
    id varcahr(32) not null primary key,    activity_code varchar(255)  ,    activity_city varchar(255)  ,    activity_name varchar(255)  ,    activity_start_time datetime  ,    activity_end_time datetime  ,    activity_push_title varchar(255)  ,    activity_push_content varchar(255)  ,    activity_push_pic_url varchar(255)  ,    activity_push_pic_media_id varchar(255)  ,    activity_push_content_url varchar(255)  ,    activity_admin_account varchar(255)  ,    activity_admin_password varchar(255)  ,    created_at datetime not null ,    created_by varchar(255)  ,    updated_at datetime  ,    updated_by varchar(255)  ,    dr tinyint not null );
CREATE TABLE IF NOT EXISTS enterprise(
    name varchar(255) not null ,    type varchar(255)  ,    area varchar(255)  ,    status varchar(255)  ,    address varchar(255)  ,    duty_paragraph varchar(255)  ,    CREATED_BY varchar(255)  ,    CREATED_TIME datetime  ,    UPDATED_BY varchar(255)  ,    UPDATED_TIME datetime  ,    username varchar(255)  ,    password varchar(255)  ,    phone varchar(255)  ,    business_nature varchar(255)  ,    province varchar(255)  ,    city varchar(255)  ,    contact varchar(255)  ,    department varchar(255)  ,    position varchar(255)  ,    business_phone varchar(255)  ,    business_post varchar(255)  ,    fax varchar(255)  ,    website varchar(255)  ,    email varchar(255)  ,    bank varchar(255)  ,    bank_account varchar(255)  ,    alias varchar(255)  ,    remark varchar(255)  ,    trustee varchar(255)  ,    trustee_phone varchar(255)  ,    trustee_department varchar(255)  ,    trustee_id_card varchar(255)  ,    id_card_url varchar(255)  ,    id_card_url_negative varchar(255)  ,    attorney varchar(255)  ,    three_certificates tinyint  ,    uscc varchar(255)  ,    legal_representative varchar(255)  ,    funds varchar(255)  ,    start_time datetime  ,    end_time datetime  ,    long_effective tinyint  ,    establishment_date datetime  ,    residence varchar(255)  ,    business_scope varchar(255)  ,    license_remark varchar(255)  ,    business_license_url varchar(255)  ,    legal_id_card_url varchar(255)  ,    legal_id_card_url_negative varchar(255)  ,    business_code varchar(255)  ,    business_name varchar(255)  ,    effective_date datetime  ,    deadline datetime  ,    business_long_effective tinyint  ,    business_method varchar(255)  ,    legal varchar(255)  ,    principal varchar(255)  ,    business_residence varchar(255)  ,    business_place varchar(255)  ,    business_range varchar(255)  ,    store_address varchar(255)  ,    annex_url varchar(255)  ,    role tinyint  ,    id varcahr(32) not null primary key,    number varchar(255)  );
CREATE TABLE IF NOT EXISTS pc_order(
    id varcahr(32) not null primary key,    order_id varchar(255) not null ,    Order_Amount int  not null ,    discount_mount int   ,    payment_amount int  not null ,    order_status varchar(255)  ,    pay_time datetime  ,    pay_account varchar(255)  ,    sign_status varchar(255)  ,    signer varchar(255)  ,    sign_time date  ,    pay_status int   ,    enterprise_id varchar(255) not null ,    address_id varchar(255)  ,    dispatching_way varchar(255)  ,    dispatching_time datetime  ,    dr int   ,    CREATED_BY varchar(255)  ,    CREATED_TIME datetime  ,    UPDATED_BY varchar(255)  ,    UPDATED_TIME datetime  ,    pay_way varchar(255)  ,    type int   );
