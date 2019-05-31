package org.fjala.gugumber.salesforce.api;

import org.fjala.gugumber.salesforce.entities.Account;

public class AccountApi {
    private String ACCOUNT_ENDPOINT = "/Account";
    private BaseApi restClient;

    public AccountApi () {
        restClient = new BaseApi();
    }

    public void deleteAccount(Account account) {
        //TODO get id of account.
        restClient.delete(ACCOUNT_ENDPOINT);
    }
}
