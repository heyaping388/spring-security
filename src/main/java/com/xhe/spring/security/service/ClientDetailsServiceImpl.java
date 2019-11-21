package com.xhe.spring.security.service;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Component;

/**
 * @Auther: xhe
 * @Date: 2019/11/18 16:59
 * @Description:
 */
@Component
public class ClientDetailsServiceImpl implements ClientDetailsService {
    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

        BaseClientDetails clientDetails = new BaseClientDetails(clientId, "",
                "server", "password,refresh_token,authorization_code,client_credentials,implicit", "");
        clientDetails.setClientSecret("{noop}test");
        return clientDetails;
    }
}
