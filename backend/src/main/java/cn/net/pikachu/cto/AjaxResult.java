package cn.net.pikachu.cto;

/**
 * Created by pikachu on 2016/9/13 20:33 in
 * AjaxResult
 */
public class AjaxResult {
    private Boolean success;

    public AjaxResult(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                '}';
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
