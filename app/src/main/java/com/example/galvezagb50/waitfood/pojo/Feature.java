package com.example.galvezagb50.waitfood.pojo;

/**
 * Created by galvezagb50
 */

public class Feature {

        private String nameFeature;
        private String feature;

        public String getNameFeature() {return nameFeature;}

        public void setNameFeature(String nameFeature) {
            this.nameFeature = nameFeature;
        }

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature;
        }


        public Feature(String nameFeature, String feature) {
            this.nameFeature = nameFeature;
            this.feature = feature;
        }

}
