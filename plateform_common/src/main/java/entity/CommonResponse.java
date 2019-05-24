package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王文泽
 * 通用的响应结果
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {
    private Integer code; //响应码
    private boolean success;//是否操作成功
    private String message;//返回信息
    private Object data;//返回数据
    public CommonResponse(Integer code,boolean success,String message){
        this.code = code;
        this.success = success;
        this.message = message;
    }
}
