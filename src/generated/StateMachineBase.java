/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("WebBrowser", com.codename1.components.WebBrowser.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("WebBrowser", com.codename1.components.WebBrowser.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Button findOrder(Component root) {
        return (com.codename1.ui.Button)findByName("Order", root);
    }

    public com.codename1.ui.Button findOrder() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Order", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Order", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.WebBrowser findWebBrowser(Component root) {
        return (com.codename1.components.WebBrowser)findByName("WebBrowser", root);
    }

    public com.codename1.components.WebBrowser findWebBrowser() {
        com.codename1.components.WebBrowser cmp = (com.codename1.components.WebBrowser)findByName("WebBrowser", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.WebBrowser)findByName("WebBrowser", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBox(Component root) {
        return (com.codename1.ui.ComboBox)findByName("ComboBox", root);
    }

    public com.codename1.ui.ComboBox findComboBox() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("ComboBox", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("ComboBox", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findQuantity(Component root) {
        return (com.codename1.ui.TextField)findByName("Quantity", root);
    }

    public com.codename1.ui.TextField findQuantity() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Quantity", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Quantity", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainChooseDest = 2;
    public static final int COMMAND_DestOrder = 1;

    protected boolean onMainChooseDest() {
        return false;
    }

    protected boolean onDestOrder() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainChooseDest:
                if(onMainChooseDest()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_DestOrder:
                if(onDestOrder()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("Pay".equals(f.getName())) {
            exitPay(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Dest".equals(f.getName())) {
            exitDest(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitPay(Form f) {
    }


    protected void exitDest(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Pay".equals(f.getName())) {
            beforePay(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Dest".equals(f.getName())) {
            beforeDest(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforePay(Form f) {
    }


    protected void beforeDest(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Pay".equals(c.getName())) {
            beforeContainerPay(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Dest".equals(c.getName())) {
            beforeContainerDest(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerPay(Container c) {
    }


    protected void beforeContainerDest(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Pay".equals(f.getName())) {
            postPay(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Dest".equals(f.getName())) {
            postDest(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postPay(Form f) {
    }


    protected void postDest(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Pay".equals(c.getName())) {
            postContainerPay(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Dest".equals(c.getName())) {
            postContainerDest(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerPay(Container c) {
    }


    protected void postContainerDest(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Pay".equals(rootName)) {
            onCreatePay();
            aboutToShowThisContainer = null;
            return;
        }

        if("Dest".equals(rootName)) {
            onCreateDest();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreatePay() {
    }


    protected void onCreateDest() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Pay".equals(f.getName())) {
            getStatePay(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Dest".equals(f.getName())) {
            getStateDest(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStatePay(Form f, Hashtable h) {
    }


    protected void getStateDest(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Pay".equals(f.getName())) {
            setStatePay(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Dest".equals(f.getName())) {
            setStateDest(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStatePay(Form f, Hashtable state) {
    }


    protected void setStateDest(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("ComboBox".equals(listName)) {
            return initListModelComboBox(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelComboBox(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Dest")) {
            if("Button".equals(c.getName())) {
                onDest_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Order".equals(c.getName())) {
                onMain_OrderAction(c, event);
                return;
            }
            if("Quantity".equals(c.getName())) {
                onMain_QuantityAction(c, event);
                return;
            }
            if("ComboBox".equals(c.getName())) {
                onMain_ComboBoxAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
        }
    }

      protected void onDest_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_OrderAction(Component c, ActionEvent event) {
      }

      protected void onMain_QuantityAction(Component c, ActionEvent event) {
      }

      protected void onMain_ComboBoxAction(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

}
