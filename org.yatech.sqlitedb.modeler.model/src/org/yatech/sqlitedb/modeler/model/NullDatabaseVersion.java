package org.yatech.sqlitedb.modeler.model;

import org.yatech.sqlitedb.modeler.model.Database;
import org.yatech.sqlitedb.modeler.model.DatabaseVersion;
import org.yatech.sqlitedb.modeler.model.common.ColumnMapping;
import org.yatech.sqlitedb.modeler.model.common.TableMapping;
import org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl;


public final class NullDatabaseVersion extends DatabaseVersionImpl {
	
	public static final DatabaseVersion NULL_VALUE = new NullDatabaseVersion();
	
	private NullDatabaseVersion() {}
	
	@Override
	public void setColumnMapping(ColumnMapping newColumnMapping) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void setDatabase(Database newDatabase) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void setNextVersion(DatabaseVersion newNextVersion) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void setPreviousVersion(DatabaseVersion newPreviousVersion) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void setTableMapping(TableMapping newTableMapping) {
		throw new UnsupportedOperationException();
	}
	
}
