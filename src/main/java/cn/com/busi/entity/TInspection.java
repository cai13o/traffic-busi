package cn.com.busi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "cn-com-busi-entity-TInspectionInstrument")
@Data
public class TInspection implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private String id;

    private String xzqy;
    private String cllx;
    private String ppxh;
    private String rllb;
    private String syxz;
    private String jyrq;
    private String jyjgmc;
    private String jyjl;
    private String zjcs;




    private static final long serialVersionUID = 1L;
}