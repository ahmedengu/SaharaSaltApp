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
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
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
        return "Login";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Login");
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

    public com.codename1.ui.TextField findEmail(Component root) {
        return (com.codename1.ui.TextField)findByName("Email", root);
    }

    public com.codename1.ui.TextField findEmail() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Email", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Email", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findProductsList2(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("ProductsList2", root);
    }

    public com.codename1.ui.list.MultiList findProductsList2() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("ProductsList2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("ProductsList2", aboutToShowThisContainer);
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

    public com.codename1.ui.Component findLogin(Component root) {
        return (com.codename1.ui.Component)findByName("Login", root);
    }

    public com.codename1.ui.Component findLogin() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Login", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Login", aboutToShowThisContainer);
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

    public com.codename1.ui.Button findRegister(Component root) {
        return (com.codename1.ui.Button)findByName("Register", root);
    }

    public com.codename1.ui.Button findRegister() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Register", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Register", aboutToShowThisContainer);
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

    public com.codename1.ui.Button findReset(Component root) {
        return (com.codename1.ui.Button)findByName("Reset", root);
    }

    public com.codename1.ui.Button findReset() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Reset", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Reset", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPassword(Component root) {
        return (com.codename1.ui.TextField)findByName("Password", root);
    }

    public com.codename1.ui.TextField findPassword() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Password", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Password", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainChooseDest = 2;
    public static final int COMMAND_DestOrder = 1;
    public static final int COMMAND_MainProducts = 3;

    protected boolean onMainChooseDest() {
        return false;
    }

    protected boolean onDestOrder() {
        return false;
    }

    protected boolean onMainProducts() {
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

            case COMMAND_MainProducts:
                if(onMainProducts()) {
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
        if("Login".equals(f.getName())) {
            exitLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Products".equals(f.getName())) {
            exitProducts(f);
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


    protected void exitLogin(Form f) {
    }


    protected void exitProducts(Form f) {
    }


    protected void exitDest(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Login".equals(f.getName())) {
            beforeLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Products".equals(f.getName())) {
            beforeProducts(f);
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


    protected void beforeLogin(Form f) {
    }


    protected void beforeProducts(Form f) {
    }


    protected void beforeDest(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Login".equals(c.getName())) {
            beforeContainerLogin(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Products".equals(c.getName())) {
            beforeContainerProducts(c);
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


    protected void beforeContainerLogin(Container c) {
    }


    protected void beforeContainerProducts(Container c) {
    }


    protected void beforeContainerDest(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Login".equals(f.getName())) {
            postLogin(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Products".equals(f.getName())) {
            postProducts(f);
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


    protected void postLogin(Form f) {
    }


    protected void postProducts(Form f) {
    }


    protected void postDest(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Login".equals(c.getName())) {
            postContainerLogin(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Products".equals(c.getName())) {
            postContainerProducts(c);
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


    protected void postContainerLogin(Container c) {
    }


    protected void postContainerProducts(Container c) {
    }


    protected void postContainerDest(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Login".equals(rootName)) {
            onCreateLogin();
            aboutToShowThisContainer = null;
            return;
        }

        if("Products".equals(rootName)) {
            onCreateProducts();
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


    protected void onCreateLogin() {
    }


    protected void onCreateProducts() {
    }


    protected void onCreateDest() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Login".equals(f.getName())) {
            getStateLogin(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Products".equals(f.getName())) {
            getStateProducts(f, h);
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


    protected void getStateLogin(Form f, Hashtable h) {
    }


    protected void getStateProducts(Form f, Hashtable h) {
    }


    protected void getStateDest(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Login".equals(f.getName())) {
            setStateLogin(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Products".equals(f.getName())) {
            setStateProducts(f, state);
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


    protected void setStateLogin(Form f, Hashtable state) {
    }


    protected void setStateProducts(Form f, Hashtable state) {
    }


    protected void setStateDest(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("ProductsList2".equals(listName)) {
            return initListModelProductsList2(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelProductsList2(List cmp) {
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
        if(rootContainerName.equals("Login")) {
            if("Email".equals(c.getName())) {
                onLogin_EmailAction(c, event);
                return;
            }
            if("Reset".equals(c.getName())) {
                onLogin_ResetAction(c, event);
                return;
            }
            if("Password".equals(c.getName())) {
                onLogin_PasswordAction(c, event);
                return;
            }
            if("Login".equals(c.getName())) {
                onLogin_LoginAction(c, event);
                return;
            }
            if("Register".equals(c.getName())) {
                onLogin_RegisterAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Products")) {
            if("ProductsList2".equals(c.getName())) {
                onProducts_ProductsList2Action(c, event);
                return;
            }
        }
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
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
            if("Quantity".equals(c.getName())) {
                onMain_QuantityAction(c, event);
                return;
            }
        }
    }

      protected void onLogin_EmailAction(Component c, ActionEvent event) {
      }

      protected void onLogin_ResetAction(Component c, ActionEvent event) {
      }

      protected void onLogin_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onLogin_LoginAction(Component c, ActionEvent event) {
      }

      protected void onLogin_RegisterAction(Component c, ActionEvent event) {
      }

      protected void onProducts_ProductsList2Action(Component c, ActionEvent event) {
      }

      protected void onDest_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_OrderAction(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_QuantityAction(Component c, ActionEvent event) {
      }

}
