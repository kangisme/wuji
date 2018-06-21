package com.kang.wuji.model;

import java.util.List;

/**
 * @author created by kangren on 2018/6/14 10:32
 */
public class TemplateModel {

    private List<TemplateBean> template;

    public List<TemplateBean> getTemplate() {
        return template;
    }

    public void setTemplate(List<TemplateBean> template) {
        this.template = template;
    }

    public static class TemplateBean {
        /**
         * id : 1
         * item : 用户头像
         * icon : com.wujiteam.wuji:drawable/icon_user_update_data
         * activityName : com.wujiteam.wuji.ui.activity.user.ModifyUserInfoActivity
         */

        private int id;
        private String item;
        private String icon;
        private String activityName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getActivityName() {
            return activityName;
        }

        public void setActivityName(String activityName) {
            this.activityName = activityName;
        }
    }
}
