/*
 * Copyright 2000-2022 Vaadin Ltd.
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
package com.vaadin.shared.ui.grid;

/**
 * Enumeration, specifying the content type of a Cell in a GridStaticSection.
 *
 * @since 7.4
 * @author Vaadin Ltd
 */
public enum GridStaticCellType {
    /**
     * Text content.
     */
    TEXT,

    /**
     * HTML content.
     */
    HTML,

    /**
     * Widget content.
     */
    WIDGET;
}
