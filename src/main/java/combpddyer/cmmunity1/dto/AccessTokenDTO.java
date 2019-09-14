package combpddyer.cmmunity1.dto;

/**
 * @Auther: 奔跑的玉哥儿
 * @Date: 2019/9/6
 * @Description: combpddyer.cmmunity1.dto
 * @Version: 1.0
 */
public class AccessTokenDTO {
    private String Client_id;
    private String Client_secret;
    private String code;
    public String Redirect_uri;
    private String state;

    public String getClient_id() {
        return Client_id;
    }

    public void setClient_id(String client_id) {
        Client_id = client_id;
    }

    public String getClient_secret() {
        return Client_secret;
    }

    public void setClient_secret(String client_secret) {
        Client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_uri() {
        return Redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        Redirect_uri = redirect_uri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
