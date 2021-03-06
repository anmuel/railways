package net.bitpot.railways.gui;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;
import icons.RubyIcons;

import javax.swing.*;

/**
 * Class contains all plugin icons.
 */
public class RailwaysIcons {
    private static final String PLUGIN_ICONS_PATH = "/net/bitpot/railways/icons/";

    private static Icon pluginIcon(String name) {
        return IconLoader.getIcon(PLUGIN_ICONS_PATH + name);
    }

    public static final Icon HTTP_METHOD_ANY = pluginIcon("method_any.png");
    public static final Icon HTTP_METHOD_GET = pluginIcon("method_get.png");
    public static final Icon HTTP_METHOD_POST = pluginIcon("method_post.png");
    public static final Icon HTTP_METHOD_PUT = pluginIcon("method_put.png");
    public static final Icon HTTP_METHOD_DELETE = pluginIcon("method_delete.png");
    public static final Icon RACK_APPLICATION = pluginIcon("rack.png");
    public static final Icon RAKE = RubyIcons.Rake.Rake_runConfiguration;

    public static final Icon CONTROLLER_NODE = RubyIcons.Ruby.Nodes.Controllernode;
    public static final Icon METHOD_NODE = AllIcons.Nodes.Method;
    public static final Icon ROUTE_ACTION_NODE = RubyIcons.Rails.ProjectView.Action_method;
    public static final Icon ERROR_NODE = AllIcons.General.Error;
    public static final Icon UNKNOWN = pluginIcon("unknown.png");
    public static final Icon REDIRECT_NODE = pluginIcon("redirect.png");

    public static final Icon UPDATE = IconLoader.getIcon("/actions/sync.png");
    public static final Icon SUSPEND = IconLoader.getIcon("/actions/suspend.png");
}
