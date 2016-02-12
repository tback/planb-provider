package org.zalando.planb.provider;

import java.util.Map;

public interface UserRealm {

    Map<String,Object> authenticate(String username, String password, String[] scopes)
            throws RealmAuthenticationException, RealmAuthorizationException;

}
