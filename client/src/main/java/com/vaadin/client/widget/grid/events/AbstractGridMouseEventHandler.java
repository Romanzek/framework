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
package com.vaadin.client.widget.grid.events;

import com.google.gwt.event.shared.EventHandler;
import com.vaadin.client.widgets.Grid.AbstractGridMouseEvent;

/**
 * Base interface of all handlers for {@link AbstractGridMouseEvent}s.
 *
 * @since 7.4
 * @author Vaadin Ltd
 */
public abstract interface AbstractGridMouseEventHandler extends EventHandler {

    /**
     * Handler for Grid click events.
     */
    public abstract interface GridClickHandler
            extends AbstractGridMouseEventHandler {
        /**
         * Perform actions that should happen when the Grid is clicked.
         *
         * @param event
         *            the click event
         */
        public void onClick(GridClickEvent event);
    }

    /**
     * Handler for Grid double-click events.
     */
    public abstract interface GridDoubleClickHandler
            extends AbstractGridMouseEventHandler {
        /**
         * Perform actions that should happen when the Grid is double-clicked.
         *
         * @param event
         *            the double-click event
         */
        public void onDoubleClick(GridDoubleClickEvent event);
    }

}
