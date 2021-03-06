/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.search.client.impl;

import com.google.gwt.search.jsio.client.JSOpaque;

/**
 * Used with
 * {@link GimageSearch#setRestriction(com.google.gwt.search.client.ImageSearch, JSOpaque, JSOpaque)}
 * control the types of results displayed.
 */
public enum ImageSearchRestrict {
  COLORIZATION("COLORIZATION"), FILETYPE("FILETYPE"), IMAGESIZE("IMAGESIZE"), IMAGETYPE(
      "IMAGETYPE"), SAFESEARCH("SAFESEARCH");

  private final JSOpaque value;

  private ImageSearchRestrict(String type) {
    value = new JSOpaque("$wnd.GSearch.RESTRICT_" + type);
  }

  public JSOpaque getValue() {
    return value;
  }
}
