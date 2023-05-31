package top.kjwang.convert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kjwang
 * @Date 2023/3/8 19:26
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class E {
    private String url;
    private String name;
    private String content;
}
