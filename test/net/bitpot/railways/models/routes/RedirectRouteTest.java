package net.bitpot.railways.models.routes;

import net.bitpot.railways.gui.RailwaysIcons;
import net.bitpot.railways.models.Route;
import net.bitpot.railways.models.requestMethods.RequestMethod;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Basil Gren
 *         on 16.12.2014.
 */
public class RedirectRouteTest {

    @Test
    public void testSimpleRedirectRoute()
    {
        Route route = new RedirectRoute(null, RequestMethod.GET, "/test",
                "redirect", "/test_redirect");

        assertEquals(RailwaysIcons.REDIRECT_NODE, route.getActionIcon());
        assertEquals("redirect to /test_redirect", route.getQualifiedActionTitle());
        assertEquals("/test_redirect", route.getActionTitle());
    }


    @Test
    public void testNullRedirectPath()
    {
        Route route = new RedirectRoute(null, RequestMethod.GET, "/test",
                "redirect", null);

        assertEquals(RailwaysIcons.REDIRECT_NODE, route.getActionIcon());
        assertEquals("[redirect]", route.getActionTitle());
        assertEquals("[runtime defined redirect]", route.getQualifiedActionTitle());
    }

}
