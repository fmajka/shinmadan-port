package com.nttdocomo.ui;

public abstract class IApplication {
    public static int LAUNCH_BROWSER = 1;

    // IApplication.getCurrentApp().launch(1, new String[]{"http://womohide.turubeotoshi.com/"});
    // TODO: implement IApplication
    public static IApplication getCurrentApp() {
        return new IApplication() {
            @Override
            public void launch(int type, String[] args) {
                // TODO Auto-generated method stub
                super.launch(type, args);
            }
        };
    }

    public void launch(int type, String[] args) {

    }
}