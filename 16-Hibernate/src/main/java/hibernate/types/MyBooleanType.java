package hibernate.types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.type.BooleanType;
import org.hibernate.type.StringType;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class MyBooleanType implements UserType {

	@Override
	public int[] sqlTypes() {
		return new int[]{ Types.VARCHAR };
	}

	@Override
	public Class returnedClass() {
		return Boolean.class;
	}

	@Override
	public boolean equals(Object x, Object y) throws HibernateException {
		if (x == null) {
			return y == null;
		} else {
			return y != null && x.equals(y);
		}
	}

	@Override
	public int hashCode(Object o) throws HibernateException {
		return o.hashCode();
	}

	@Override
	public Object deepCopy(Object o) throws HibernateException {
		return o;
	}

	@Override
	public boolean isMutable() {
		return false;
	}

	@Override
	public Serializable disassemble(Object o) throws HibernateException {
		return (Serializable) o;
	}

	@Override
	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		return cached;
	}

	@Override
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return original;
	}

	@Override
	public Object nullSafeGet(ResultSet resultSet, String[] strings, SessionImplementor sessionImplementor, Object o) throws HibernateException, SQLException {
		String str = (String) StringType.INSTANCE.nullSafeGet(resultSet, strings[0], sessionImplementor, o);
		if ("1".equals(str)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	@Override
	public void nullSafeSet(PreparedStatement preparedStatement, Object value, int i, SessionImplementor sessionImplementor) throws HibernateException, SQLException {
		String valueToStore = "0";
		if (value != null) {
			Boolean booleanValue = (Boolean) value;
			if (booleanValue.equals(Boolean.TRUE)) {
				valueToStore = "1";
			}
		}
		StringType.INSTANCE.nullSafeSet(preparedStatement,valueToStore, i, sessionImplementor);
	}
}
