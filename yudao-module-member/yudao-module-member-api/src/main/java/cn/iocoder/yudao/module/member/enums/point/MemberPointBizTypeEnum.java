package cn.iocoder.yudao.module.member.enums.point;

import cn.hutool.core.util.EnumUtil;
import cn.iocoder.yudao.framework.common.core.IntArrayValuable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * 会员积分的业务类型枚举
 *
 * @author 芋道源码
 */
@AllArgsConstructor
@Getter
public enum MemberPointBizTypeEnum implements IntArrayValuable {

    SIGN(1, "签到", "签到获得 {} 积分", false),
    ORDER_BUY(10, "订单消费", "下单获得 {} 积分", false),
    ORDER_CANCEL(11, "订单取消", "退单获得 {} 积分", true); // 退回积分

    /**
     * 类型
     */
    private final Integer type;
    /**
     * 名字
     */
    private final String name;
    /**
     * 描述
     */
    private final String description;
    // TODO @疯狂：改成 add 会好点。一个是属性我们尽量不要 isXXX；另外尽量正向思维，不取反；
    /**
     * 是否为扣减积分
     */
    private final boolean isReduce;

    @Override
    public int[] array() {
        return new int[0];
    }

    public static MemberPointBizTypeEnum getByType(Integer type) {
        return EnumUtil.getBy(MemberPointBizTypeEnum.class,
                e -> Objects.equals(type, e.getType()));
    }

}