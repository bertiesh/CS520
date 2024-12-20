package org.example.cs520.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Xinyuan Xu
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_question_tag")
public class QuestionTag {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer questionId;

    private Integer tagId;
}
