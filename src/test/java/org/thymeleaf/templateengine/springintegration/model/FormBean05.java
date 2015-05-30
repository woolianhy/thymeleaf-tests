/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.templateengine.springintegration.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class FormBean05 {

    protected Map<String, Object> properties = new LinkedHashMap<String, Object>();
    protected Map<String, Boolean> booleanProperties = new LinkedHashMap<String, Boolean>();

    public Map<String, Object> getProperties() {
        return this.properties;
    }
    public Map<String, Boolean> getBooleanProperties() {
        return this.booleanProperties;
    }

}