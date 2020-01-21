package com.callcar.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarFindPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarFindPersonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarUserNameIsNull() {
            addCriterion("car_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCarUserNameIsNotNull() {
            addCriterion("car_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarUserNameEqualTo(String value) {
            addCriterion("car_user_name =", value, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameNotEqualTo(String value) {
            addCriterion("car_user_name <>", value, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameGreaterThan(String value) {
            addCriterion("car_user_name >", value, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_user_name >=", value, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameLessThan(String value) {
            addCriterion("car_user_name <", value, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameLessThanOrEqualTo(String value) {
            addCriterion("car_user_name <=", value, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameLike(String value) {
            addCriterion("car_user_name like", value, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameNotLike(String value) {
            addCriterion("car_user_name not like", value, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameIn(List<String> values) {
            addCriterion("car_user_name in", values, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameNotIn(List<String> values) {
            addCriterion("car_user_name not in", values, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameBetween(String value1, String value2) {
            addCriterion("car_user_name between", value1, value2, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarUserNameNotBetween(String value1, String value2) {
            addCriterion("car_user_name not between", value1, value2, "carUserName");
            return (Criteria) this;
        }

        public Criteria andCarSexIsNull() {
            addCriterion("car_sex is null");
            return (Criteria) this;
        }

        public Criteria andCarSexIsNotNull() {
            addCriterion("car_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCarSexEqualTo(String value) {
            addCriterion("car_sex =", value, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexNotEqualTo(String value) {
            addCriterion("car_sex <>", value, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexGreaterThan(String value) {
            addCriterion("car_sex >", value, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexGreaterThanOrEqualTo(String value) {
            addCriterion("car_sex >=", value, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexLessThan(String value) {
            addCriterion("car_sex <", value, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexLessThanOrEqualTo(String value) {
            addCriterion("car_sex <=", value, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexLike(String value) {
            addCriterion("car_sex like", value, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexNotLike(String value) {
            addCriterion("car_sex not like", value, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexIn(List<String> values) {
            addCriterion("car_sex in", values, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexNotIn(List<String> values) {
            addCriterion("car_sex not in", values, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexBetween(String value1, String value2) {
            addCriterion("car_sex between", value1, value2, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarSexNotBetween(String value1, String value2) {
            addCriterion("car_sex not between", value1, value2, "carSex");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneIsNull() {
            addCriterion("car_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneIsNotNull() {
            addCriterion("car_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneEqualTo(String value) {
            addCriterion("car_user_phone =", value, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneNotEqualTo(String value) {
            addCriterion("car_user_phone <>", value, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneGreaterThan(String value) {
            addCriterion("car_user_phone >", value, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("car_user_phone >=", value, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneLessThan(String value) {
            addCriterion("car_user_phone <", value, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("car_user_phone <=", value, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneLike(String value) {
            addCriterion("car_user_phone like", value, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneNotLike(String value) {
            addCriterion("car_user_phone not like", value, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneIn(List<String> values) {
            addCriterion("car_user_phone in", values, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneNotIn(List<String> values) {
            addCriterion("car_user_phone not in", values, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneBetween(String value1, String value2) {
            addCriterion("car_user_phone between", value1, value2, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarUserPhoneNotBetween(String value1, String value2) {
            addCriterion("car_user_phone not between", value1, value2, "carUserPhone");
            return (Criteria) this;
        }

        public Criteria andCarWechatIsNull() {
            addCriterion("car_wechat is null");
            return (Criteria) this;
        }

        public Criteria andCarWechatIsNotNull() {
            addCriterion("car_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andCarWechatEqualTo(String value) {
            addCriterion("car_wechat =", value, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatNotEqualTo(String value) {
            addCriterion("car_wechat <>", value, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatGreaterThan(String value) {
            addCriterion("car_wechat >", value, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatGreaterThanOrEqualTo(String value) {
            addCriterion("car_wechat >=", value, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatLessThan(String value) {
            addCriterion("car_wechat <", value, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatLessThanOrEqualTo(String value) {
            addCriterion("car_wechat <=", value, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatLike(String value) {
            addCriterion("car_wechat like", value, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatNotLike(String value) {
            addCriterion("car_wechat not like", value, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatIn(List<String> values) {
            addCriterion("car_wechat in", values, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatNotIn(List<String> values) {
            addCriterion("car_wechat not in", values, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatBetween(String value1, String value2) {
            addCriterion("car_wechat between", value1, value2, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarWechatNotBetween(String value1, String value2) {
            addCriterion("car_wechat not between", value1, value2, "carWechat");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrIsNull() {
            addCriterion("car_pass_addr is null");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrIsNotNull() {
            addCriterion("car_pass_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrEqualTo(String value) {
            addCriterion("car_pass_addr =", value, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrNotEqualTo(String value) {
            addCriterion("car_pass_addr <>", value, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrGreaterThan(String value) {
            addCriterion("car_pass_addr >", value, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrGreaterThanOrEqualTo(String value) {
            addCriterion("car_pass_addr >=", value, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrLessThan(String value) {
            addCriterion("car_pass_addr <", value, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrLessThanOrEqualTo(String value) {
            addCriterion("car_pass_addr <=", value, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrLike(String value) {
            addCriterion("car_pass_addr like", value, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrNotLike(String value) {
            addCriterion("car_pass_addr not like", value, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrIn(List<String> values) {
            addCriterion("car_pass_addr in", values, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrNotIn(List<String> values) {
            addCriterion("car_pass_addr not in", values, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrBetween(String value1, String value2) {
            addCriterion("car_pass_addr between", value1, value2, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarPassAddrNotBetween(String value1, String value2) {
            addCriterion("car_pass_addr not between", value1, value2, "carPassAddr");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumIsNull() {
            addCriterion("car_seat_person_num is null");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumIsNotNull() {
            addCriterion("car_seat_person_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumEqualTo(Integer value) {
            addCriterion("car_seat_person_num =", value, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumNotEqualTo(Integer value) {
            addCriterion("car_seat_person_num <>", value, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumGreaterThan(Integer value) {
            addCriterion("car_seat_person_num >", value, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_seat_person_num >=", value, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumLessThan(Integer value) {
            addCriterion("car_seat_person_num <", value, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumLessThanOrEqualTo(Integer value) {
            addCriterion("car_seat_person_num <=", value, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumIn(List<Integer> values) {
            addCriterion("car_seat_person_num in", values, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumNotIn(List<Integer> values) {
            addCriterion("car_seat_person_num not in", values, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumBetween(Integer value1, Integer value2) {
            addCriterion("car_seat_person_num between", value1, value2, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSeatPersonNumNotBetween(Integer value1, Integer value2) {
            addCriterion("car_seat_person_num not between", value1, value2, "carSeatPersonNum");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrIsNull() {
            addCriterion("car_send_addr is null");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrIsNotNull() {
            addCriterion("car_send_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrEqualTo(String value) {
            addCriterion("car_send_addr =", value, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrNotEqualTo(String value) {
            addCriterion("car_send_addr <>", value, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrGreaterThan(String value) {
            addCriterion("car_send_addr >", value, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrGreaterThanOrEqualTo(String value) {
            addCriterion("car_send_addr >=", value, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrLessThan(String value) {
            addCriterion("car_send_addr <", value, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrLessThanOrEqualTo(String value) {
            addCriterion("car_send_addr <=", value, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrLike(String value) {
            addCriterion("car_send_addr like", value, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrNotLike(String value) {
            addCriterion("car_send_addr not like", value, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrIn(List<String> values) {
            addCriterion("car_send_addr in", values, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrNotIn(List<String> values) {
            addCriterion("car_send_addr not in", values, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrBetween(String value1, String value2) {
            addCriterion("car_send_addr between", value1, value2, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarSendAddrNotBetween(String value1, String value2) {
            addCriterion("car_send_addr not between", value1, value2, "carSendAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrIsNull() {
            addCriterion("car_arive_addr is null");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrIsNotNull() {
            addCriterion("car_arive_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrEqualTo(String value) {
            addCriterion("car_arive_addr =", value, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrNotEqualTo(String value) {
            addCriterion("car_arive_addr <>", value, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrGreaterThan(String value) {
            addCriterion("car_arive_addr >", value, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrGreaterThanOrEqualTo(String value) {
            addCriterion("car_arive_addr >=", value, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrLessThan(String value) {
            addCriterion("car_arive_addr <", value, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrLessThanOrEqualTo(String value) {
            addCriterion("car_arive_addr <=", value, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrLike(String value) {
            addCriterion("car_arive_addr like", value, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrNotLike(String value) {
            addCriterion("car_arive_addr not like", value, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrIn(List<String> values) {
            addCriterion("car_arive_addr in", values, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrNotIn(List<String> values) {
            addCriterion("car_arive_addr not in", values, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrBetween(String value1, String value2) {
            addCriterion("car_arive_addr between", value1, value2, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarAriveAddrNotBetween(String value1, String value2) {
            addCriterion("car_arive_addr not between", value1, value2, "carAriveAddr");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusIsNull() {
            addCriterion("car_current_seat_status is null");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusIsNotNull() {
            addCriterion("car_current_seat_status is not null");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusEqualTo(String value) {
            addCriterion("car_current_seat_status =", value, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusNotEqualTo(String value) {
            addCriterion("car_current_seat_status <>", value, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusGreaterThan(String value) {
            addCriterion("car_current_seat_status >", value, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusGreaterThanOrEqualTo(String value) {
            addCriterion("car_current_seat_status >=", value, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusLessThan(String value) {
            addCriterion("car_current_seat_status <", value, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusLessThanOrEqualTo(String value) {
            addCriterion("car_current_seat_status <=", value, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusLike(String value) {
            addCriterion("car_current_seat_status like", value, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusNotLike(String value) {
            addCriterion("car_current_seat_status not like", value, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusIn(List<String> values) {
            addCriterion("car_current_seat_status in", values, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusNotIn(List<String> values) {
            addCriterion("car_current_seat_status not in", values, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusBetween(String value1, String value2) {
            addCriterion("car_current_seat_status between", value1, value2, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentSeatStatusNotBetween(String value1, String value2) {
            addCriterion("car_current_seat_status not between", value1, value2, "carCurrentSeatStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusIsNull() {
            addCriterion("car_send_status is null");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusIsNotNull() {
            addCriterion("car_send_status is not null");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusEqualTo(String value) {
            addCriterion("car_send_status =", value, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusNotEqualTo(String value) {
            addCriterion("car_send_status <>", value, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusGreaterThan(String value) {
            addCriterion("car_send_status >", value, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("car_send_status >=", value, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusLessThan(String value) {
            addCriterion("car_send_status <", value, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusLessThanOrEqualTo(String value) {
            addCriterion("car_send_status <=", value, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusLike(String value) {
            addCriterion("car_send_status like", value, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusNotLike(String value) {
            addCriterion("car_send_status not like", value, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusIn(List<String> values) {
            addCriterion("car_send_status in", values, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusNotIn(List<String> values) {
            addCriterion("car_send_status not in", values, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusBetween(String value1, String value2) {
            addCriterion("car_send_status between", value1, value2, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarSendStatusNotBetween(String value1, String value2) {
            addCriterion("car_send_status not between", value1, value2, "carSendStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusIsNull() {
            addCriterion("car_reserve_status is null");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusIsNotNull() {
            addCriterion("car_reserve_status is not null");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusEqualTo(String value) {
            addCriterion("car_reserve_status =", value, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusNotEqualTo(String value) {
            addCriterion("car_reserve_status <>", value, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusGreaterThan(String value) {
            addCriterion("car_reserve_status >", value, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("car_reserve_status >=", value, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusLessThan(String value) {
            addCriterion("car_reserve_status <", value, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusLessThanOrEqualTo(String value) {
            addCriterion("car_reserve_status <=", value, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusLike(String value) {
            addCriterion("car_reserve_status like", value, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusNotLike(String value) {
            addCriterion("car_reserve_status not like", value, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusIn(List<String> values) {
            addCriterion("car_reserve_status in", values, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusNotIn(List<String> values) {
            addCriterion("car_reserve_status not in", values, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusBetween(String value1, String value2) {
            addCriterion("car_reserve_status between", value1, value2, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarReserveStatusNotBetween(String value1, String value2) {
            addCriterion("car_reserve_status not between", value1, value2, "carReserveStatus");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumIsNull() {
            addCriterion("car_current_reserve_num is null");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumIsNotNull() {
            addCriterion("car_current_reserve_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumEqualTo(Integer value) {
            addCriterion("car_current_reserve_num =", value, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumNotEqualTo(Integer value) {
            addCriterion("car_current_reserve_num <>", value, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumGreaterThan(Integer value) {
            addCriterion("car_current_reserve_num >", value, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_current_reserve_num >=", value, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumLessThan(Integer value) {
            addCriterion("car_current_reserve_num <", value, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumLessThanOrEqualTo(Integer value) {
            addCriterion("car_current_reserve_num <=", value, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumIn(List<Integer> values) {
            addCriterion("car_current_reserve_num in", values, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumNotIn(List<Integer> values) {
            addCriterion("car_current_reserve_num not in", values, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumBetween(Integer value1, Integer value2) {
            addCriterion("car_current_reserve_num between", value1, value2, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarCurrentReserveNumNotBetween(Integer value1, Integer value2) {
            addCriterion("car_current_reserve_num not between", value1, value2, "carCurrentReserveNum");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeIsNull() {
            addCriterion("car_send_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeIsNotNull() {
            addCriterion("car_send_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeEqualTo(Date value) {
            addCriterion("car_send_start_time =", value, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeNotEqualTo(Date value) {
            addCriterion("car_send_start_time <>", value, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeGreaterThan(Date value) {
            addCriterion("car_send_start_time >", value, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("car_send_start_time >=", value, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeLessThan(Date value) {
            addCriterion("car_send_start_time <", value, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("car_send_start_time <=", value, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeIn(List<Date> values) {
            addCriterion("car_send_start_time in", values, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeNotIn(List<Date> values) {
            addCriterion("car_send_start_time not in", values, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeBetween(Date value1, Date value2) {
            addCriterion("car_send_start_time between", value1, value2, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("car_send_start_time not between", value1, value2, "carSendStartTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeIsNull() {
            addCriterion("car_send_last_time is null");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeIsNotNull() {
            addCriterion("car_send_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeEqualTo(Date value) {
            addCriterion("car_send_last_time =", value, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeNotEqualTo(Date value) {
            addCriterion("car_send_last_time <>", value, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeGreaterThan(Date value) {
            addCriterion("car_send_last_time >", value, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("car_send_last_time >=", value, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeLessThan(Date value) {
            addCriterion("car_send_last_time <", value, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("car_send_last_time <=", value, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeIn(List<Date> values) {
            addCriterion("car_send_last_time in", values, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeNotIn(List<Date> values) {
            addCriterion("car_send_last_time not in", values, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeBetween(Date value1, Date value2) {
            addCriterion("car_send_last_time between", value1, value2, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarSendLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("car_send_last_time not between", value1, value2, "carSendLastTime");
            return (Criteria) this;
        }

        public Criteria andCarRemarkIsNull() {
            addCriterion("car_remark is null");
            return (Criteria) this;
        }

        public Criteria andCarRemarkIsNotNull() {
            addCriterion("car_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCarRemarkEqualTo(String value) {
            addCriterion("car_remark =", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkNotEqualTo(String value) {
            addCriterion("car_remark <>", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkGreaterThan(String value) {
            addCriterion("car_remark >", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("car_remark >=", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkLessThan(String value) {
            addCriterion("car_remark <", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkLessThanOrEqualTo(String value) {
            addCriterion("car_remark <=", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkLike(String value) {
            addCriterion("car_remark like", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkNotLike(String value) {
            addCriterion("car_remark not like", value, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkIn(List<String> values) {
            addCriterion("car_remark in", values, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkNotIn(List<String> values) {
            addCriterion("car_remark not in", values, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkBetween(String value1, String value2) {
            addCriterion("car_remark between", value1, value2, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarRemarkNotBetween(String value1, String value2) {
            addCriterion("car_remark not between", value1, value2, "carRemark");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeIsNull() {
            addCriterion("car_spell_type is null");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeIsNotNull() {
            addCriterion("car_spell_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeEqualTo(String value) {
            addCriterion("car_spell_type =", value, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeNotEqualTo(String value) {
            addCriterion("car_spell_type <>", value, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeGreaterThan(String value) {
            addCriterion("car_spell_type >", value, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_spell_type >=", value, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeLessThan(String value) {
            addCriterion("car_spell_type <", value, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeLessThanOrEqualTo(String value) {
            addCriterion("car_spell_type <=", value, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeLike(String value) {
            addCriterion("car_spell_type like", value, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeNotLike(String value) {
            addCriterion("car_spell_type not like", value, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeIn(List<String> values) {
            addCriterion("car_spell_type in", values, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeNotIn(List<String> values) {
            addCriterion("car_spell_type not in", values, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeBetween(String value1, String value2) {
            addCriterion("car_spell_type between", value1, value2, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCarSpellTypeNotBetween(String value1, String value2) {
            addCriterion("car_spell_type not between", value1, value2, "carSpellType");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}