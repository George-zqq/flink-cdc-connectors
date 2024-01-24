package com.ververica.cdc.common.types;/**
 * @Author george
 * @create 2024/1/23 7:23 PM
 */

import java.util.Collections;
import java.util.List;

/**
 * @ClassName LargeIntType
 * @Description
 * @Author george
 * @Mail zhaoqiangqiang@deepway.ai
 * @Date 2024/1/23 7:23 PM
 **/
public class LargeIntType extends DataType{
    private static final long serialVersionUID = 1L;

    private static final String FORMAT = "LARGEINT";

    public LargeIntType(boolean isNullable) {
        super(isNullable, DataTypeRoot.LARGEINT);
    }

    public LargeIntType() {
        this(true);
    }

    @Override
    public DataType copy(boolean isNullable) {
        return new LargeIntType(isNullable);
    }

    @Override
    public String asSerializableString() {
        return withNullability(FORMAT);
    }

    @Override
    public List<DataType> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public <R> R accept(DataTypeVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
