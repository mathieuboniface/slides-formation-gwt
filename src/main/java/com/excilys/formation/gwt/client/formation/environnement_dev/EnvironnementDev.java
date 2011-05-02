package com.excilys.formation.gwt.client.formation.environnement_dev;

import com.excilys.formation.gwt.client.formation.FormationGwt;
import com.excilys.formation.gwt.client.slider.slides.Chapter;
import com.excilys.formation.gwt.client.slider.slides.ElementSlide;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;

public class EnvironnementDev extends Chapter {

    @UiTemplate("Titre.ui.xml")
    interface Titre extends UiBinder<Element, ElementSlide> {}

    @UiTemplate("GWTDesigner.ui.xml")
    interface GWTDesigner extends UiBinder<Element, ElementSlide> {}

    @UiTemplate("SpeedTracer.ui.xml")
    interface SpeedTracer extends UiBinder<Element, ElementSlide> {}

    @Override
    protected void buildSlides() {
        addSlide(GWT.create(Titre.class));
        addSlide(GWT.create(GWTDesigner.class));
        addSlide(GWT.create(SpeedTracer.class));
        addSlide(FormationGwt.PLAN);
    }

}