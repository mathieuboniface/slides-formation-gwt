package com.excilys.formation.gwt.client.slider;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class WidgetSlide extends Composite implements Presentable {

    public WidgetSlide(UiBinder<Widget, WidgetSlide> uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
