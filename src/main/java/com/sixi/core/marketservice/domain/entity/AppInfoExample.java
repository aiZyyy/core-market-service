package com.sixi.core.marketservice.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with Mybatis Generator Plugin
 *
 * @author MiaoWoo
 * Created on 2019/08/06 03:02.
 */
public class AppInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyIsNull() {
            addCriterion("app_private_key is null");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyIsNotNull() {
            addCriterion("app_private_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyEqualTo(String value) {
            addCriterion("app_private_key =", value, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyNotEqualTo(String value) {
            addCriterion("app_private_key <>", value, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyGreaterThan(String value) {
            addCriterion("app_private_key >", value, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_private_key >=", value, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyLessThan(String value) {
            addCriterion("app_private_key <", value, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyLessThanOrEqualTo(String value) {
            addCriterion("app_private_key <=", value, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyLike(String value) {
            addCriterion("app_private_key like", value, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyNotLike(String value) {
            addCriterion("app_private_key not like", value, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyIn(List<String> values) {
            addCriterion("app_private_key in", values, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyNotIn(List<String> values) {
            addCriterion("app_private_key not in", values, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyBetween(String value1, String value2) {
            addCriterion("app_private_key between", value1, value2, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPrivateKeyNotBetween(String value1, String value2) {
            addCriterion("app_private_key not between", value1, value2, "appPrivateKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyIsNull() {
            addCriterion("app_public_key is null");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyIsNotNull() {
            addCriterion("app_public_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyEqualTo(String value) {
            addCriterion("app_public_key =", value, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyNotEqualTo(String value) {
            addCriterion("app_public_key <>", value, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyGreaterThan(String value) {
            addCriterion("app_public_key >", value, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_public_key >=", value, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyLessThan(String value) {
            addCriterion("app_public_key <", value, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("app_public_key <=", value, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyLike(String value) {
            addCriterion("app_public_key like", value, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyNotLike(String value) {
            addCriterion("app_public_key not like", value, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyIn(List<String> values) {
            addCriterion("app_public_key in", values, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyNotIn(List<String> values) {
            addCriterion("app_public_key not in", values, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyBetween(String value1, String value2) {
            addCriterion("app_public_key between", value1, value2, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppPublicKeyNotBetween(String value1, String value2) {
            addCriterion("app_public_key not between", value1, value2, "appPublicKey");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeIsNull() {
            addCriterion("app_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeIsNotNull() {
            addCriterion("app_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeEqualTo(Date value) {
            addCriterion("app_start_time =", value, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeNotEqualTo(Date value) {
            addCriterion("app_start_time <>", value, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeGreaterThan(Date value) {
            addCriterion("app_start_time >", value, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("app_start_time >=", value, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeLessThan(Date value) {
            addCriterion("app_start_time <", value, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("app_start_time <=", value, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeIn(List<Date> values) {
            addCriterion("app_start_time in", values, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeNotIn(List<Date> values) {
            addCriterion("app_start_time not in", values, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeBetween(Date value1, Date value2) {
            addCriterion("app_start_time between", value1, value2, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("app_start_time not between", value1, value2, "appStartTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeIsNull() {
            addCriterion("app_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeIsNotNull() {
            addCriterion("app_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeEqualTo(Date value) {
            addCriterion("app_end_time =", value, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeNotEqualTo(Date value) {
            addCriterion("app_end_time <>", value, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeGreaterThan(Date value) {
            addCriterion("app_end_time >", value, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("app_end_time >=", value, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeLessThan(Date value) {
            addCriterion("app_end_time <", value, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("app_end_time <=", value, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeIn(List<Date> values) {
            addCriterion("app_end_time in", values, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeNotIn(List<Date> values) {
            addCriterion("app_end_time not in", values, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeBetween(Date value1, Date value2) {
            addCriterion("app_end_time between", value1, value2, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andAppEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("app_end_time not between", value1, value2, "appEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNull() {
            addCriterion("deleted_at is null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIsNotNull() {
            addCriterion("deleted_at is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedAtEqualTo(Date value) {
            addCriterion("deleted_at =", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotEqualTo(Date value) {
            addCriterion("deleted_at <>", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThan(Date value) {
            addCriterion("deleted_at >", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("deleted_at >=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThan(Date value) {
            addCriterion("deleted_at <", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtLessThanOrEqualTo(Date value) {
            addCriterion("deleted_at <=", value, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtIn(List<Date> values) {
            addCriterion("deleted_at in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotIn(List<Date> values) {
            addCriterion("deleted_at not in", values, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtBetween(Date value1, Date value2) {
            addCriterion("deleted_at between", value1, value2, "deletedAt");
            return (Criteria) this;
        }

        public Criteria andDeletedAtNotBetween(Date value1, Date value2) {
            addCriterion("deleted_at not between", value1, value2, "deletedAt");
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