/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package tables.tab2;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TAB2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\"," +
          "\"name\":\"TAB2\"," +
          "\"namespace\":\"tables.tab2\"," +
          "\"fields\":[{\"name\":\"table\",\"type\":\"string\"}," +
          "{\"name\":\"op_type\",\"type\":\"string\"}," +
          "{\"name\":\"op_ts\",\"type\":\"string\"}," +
          "{\"name\":\"current_ts\",\"type\":\"string\"}," +
          "{\"name\":\"pos\",\"type\":\"string\"}," +
          "{\"name\":\"primary_keys\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"tokens\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":{}},{\"name\":\"before\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"columns\",\"fields\":[{\"name\":\"ID\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ID_isMissing\",\"type\":\"boolean\"},{\"name\":\"NAME\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"NAME_isMissing\",\"type\":\"boolean\"}]}],\"default\":null},{\"name\":\"after\",\"type\":[\"null\",\"columns\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public CharSequence table;
  @Deprecated public CharSequence op_type;
  @Deprecated public CharSequence op_ts;
  @Deprecated public CharSequence current_ts;
  @Deprecated public CharSequence pos;
  @Deprecated public java.util.List<CharSequence> primary_keys;
  @Deprecated public java.util.Map<CharSequence,CharSequence> tokens;
  @Deprecated public tables.tab2.columns before;
  @Deprecated public tables.tab2.columns after;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TAB2() {}

  /**
   * All-args constructor.
   */
  public TAB2(CharSequence table, CharSequence op_type, CharSequence op_ts, CharSequence current_ts, CharSequence pos, java.util.List<CharSequence> primary_keys, java.util.Map<CharSequence,CharSequence> tokens, tables.tab2.columns before, tables.tab2.columns after) {
    this.table = table;
    this.op_type = op_type;
    this.op_ts = op_ts;
    this.current_ts = current_ts;
    this.pos = pos;
    this.primary_keys = primary_keys;
    this.tokens = tokens;
    this.before = before;
    this.after = after;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return table;
    case 1: return op_type;
    case 2: return op_ts;
    case 3: return current_ts;
    case 4: return pos;
    case 5: return primary_keys;
    case 6: return tokens;
    case 7: return before;
    case 8: return after;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: table = (CharSequence)value$; break;
    case 1: op_type = (CharSequence)value$; break;
    case 2: op_ts = (CharSequence)value$; break;
    case 3: current_ts = (CharSequence)value$; break;
    case 4: pos = (CharSequence)value$; break;
    case 5: primary_keys = (java.util.List<CharSequence>)value$; break;
    case 6: tokens = (java.util.Map<CharSequence,CharSequence>)value$; break;
    case 7: before = (tables.tab2.columns)value$; break;
    case 8: after = (tables.tab2.columns)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'table' field.
   */
  public CharSequence getTable() {
    return table;
  }

  /**
   * Sets the value of the 'table' field.
   * @param value the value to set.
   */
  public void setTable(CharSequence value) {
    this.table = value;
  }

  /**
   * Gets the value of the 'op_type' field.
   */
  public CharSequence getOpType() {
    return op_type;
  }

  /**
   * Sets the value of the 'op_type' field.
   * @param value the value to set.
   */
  public void setOpType(CharSequence value) {
    this.op_type = value;
  }

  /**
   * Gets the value of the 'op_ts' field.
   */
  public CharSequence getOpTs() {
    return op_ts;
  }

  /**
   * Sets the value of the 'op_ts' field.
   * @param value the value to set.
   */
  public void setOpTs(CharSequence value) {
    this.op_ts = value;
  }

  /**
   * Gets the value of the 'current_ts' field.
   */
  public CharSequence getCurrentTs() {
    return current_ts;
  }

  /**
   * Sets the value of the 'current_ts' field.
   * @param value the value to set.
   */
  public void setCurrentTs(CharSequence value) {
    this.current_ts = value;
  }

  /**
   * Gets the value of the 'pos' field.
   */
  public CharSequence getPos() {
    return pos;
  }

  /**
   * Sets the value of the 'pos' field.
   * @param value the value to set.
   */
  public void setPos(CharSequence value) {
    this.pos = value;
  }

  /**
   * Gets the value of the 'primary_keys' field.
   */
  public java.util.List<CharSequence> getPrimaryKeys() {
    return primary_keys;
  }

  /**
   * Sets the value of the 'primary_keys' field.
   * @param value the value to set.
   */
  public void setPrimaryKeys(java.util.List<CharSequence> value) {
    this.primary_keys = value;
  }

  /**
   * Gets the value of the 'tokens' field.
   */
  public java.util.Map<CharSequence,CharSequence> getTokens() {
    return tokens;
  }

  /**
   * Sets the value of the 'tokens' field.
   * @param value the value to set.
   */
  public void setTokens(java.util.Map<CharSequence,CharSequence> value) {
    this.tokens = value;
  }

  /**
   * Gets the value of the 'before' field.
   */
  public tables.tab2.columns getBefore() {
    return before;
  }

  /**
   * Sets the value of the 'before' field.
   * @param value the value to set.
   */
  public void setBefore(tables.tab2.columns value) {
    this.before = value;
  }

  /**
   * Gets the value of the 'after' field.
   */
  public tables.tab2.columns getAfter() {
    return after;
  }

  /**
   * Sets the value of the 'after' field.
   * @param value the value to set.
   */
  public void setAfter(tables.tab2.columns value) {
    this.after = value;
  }

  /** Creates a new TAB2 RecordBuilder */
  public static TAB2.Builder newBuilder() {
    return new TAB2.Builder();
  }
  
  /** Creates a new TAB2 RecordBuilder by copying an existing Builder */
  public static tables.tab2.TAB2.Builder newBuilder(tables.tab2.TAB2.Builder other) {
    return new tables.tab2.TAB2.Builder(other);
  }
  
  /** Creates a new TAB2 RecordBuilder by copying an existing TAB2 instance */
  public static tables.tab2.TAB2.Builder newBuilder(tables.tab2.TAB2 other) {
    return new tables.tab2.TAB2.Builder(other);
  }
  
  /**
   * RecordBuilder for TAB2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TAB2>
    implements org.apache.avro.data.RecordBuilder<TAB2> {

    private CharSequence table;
    private CharSequence op_type;
    private CharSequence op_ts;
    private CharSequence current_ts;
    private CharSequence pos;
    private java.util.List<CharSequence> primary_keys;
    private java.util.Map<CharSequence,CharSequence> tokens;
    private tables.tab2.columns before;
    private tables.tab2.columns after;

    /** Creates a new Builder */
    private Builder() {
      super(tables.tab2.TAB2.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(tables.tab2.TAB2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.table)) {
        this.table = data().deepCopy(fields()[0].schema(), other.table);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.op_type)) {
        this.op_type = data().deepCopy(fields()[1].schema(), other.op_type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.op_ts)) {
        this.op_ts = data().deepCopy(fields()[2].schema(), other.op_ts);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.current_ts)) {
        this.current_ts = data().deepCopy(fields()[3].schema(), other.current_ts);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pos)) {
        this.pos = data().deepCopy(fields()[4].schema(), other.pos);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.primary_keys)) {
        this.primary_keys = data().deepCopy(fields()[5].schema(), other.primary_keys);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tokens)) {
        this.tokens = data().deepCopy(fields()[6].schema(), other.tokens);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.before)) {
        this.before = data().deepCopy(fields()[7].schema(), other.before);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.after)) {
        this.after = data().deepCopy(fields()[8].schema(), other.after);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TAB2 instance */
    private Builder(tables.tab2.TAB2 other) {
            super(tables.tab2.TAB2.SCHEMA$);
      if (isValidValue(fields()[0], other.table)) {
        this.table = data().deepCopy(fields()[0].schema(), other.table);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.op_type)) {
        this.op_type = data().deepCopy(fields()[1].schema(), other.op_type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.op_ts)) {
        this.op_ts = data().deepCopy(fields()[2].schema(), other.op_ts);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.current_ts)) {
        this.current_ts = data().deepCopy(fields()[3].schema(), other.current_ts);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pos)) {
        this.pos = data().deepCopy(fields()[4].schema(), other.pos);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.primary_keys)) {
        this.primary_keys = data().deepCopy(fields()[5].schema(), other.primary_keys);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tokens)) {
        this.tokens = data().deepCopy(fields()[6].schema(), other.tokens);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.before)) {
        this.before = data().deepCopy(fields()[7].schema(), other.before);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.after)) {
        this.after = data().deepCopy(fields()[8].schema(), other.after);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'table' field */
    public CharSequence getTable() {
      return table;
    }
    
    /** Sets the value of the 'table' field */
    public tables.tab2.TAB2.Builder setTable(CharSequence value) {
      validate(fields()[0], value);
      this.table = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'table' field has been set */
    public boolean hasTable() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'table' field */
    public tables.tab2.TAB2.Builder clearTable() {
      table = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'op_type' field */
    public CharSequence getOpType() {
      return op_type;
    }
    
    /** Sets the value of the 'op_type' field */
    public tables.tab2.TAB2.Builder setOpType(CharSequence value) {
      validate(fields()[1], value);
      this.op_type = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'op_type' field has been set */
    public boolean hasOpType() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'op_type' field */
    public tables.tab2.TAB2.Builder clearOpType() {
      op_type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'op_ts' field */
    public CharSequence getOpTs() {
      return op_ts;
    }
    
    /** Sets the value of the 'op_ts' field */
    public tables.tab2.TAB2.Builder setOpTs(CharSequence value) {
      validate(fields()[2], value);
      this.op_ts = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'op_ts' field has been set */
    public boolean hasOpTs() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'op_ts' field */
    public tables.tab2.TAB2.Builder clearOpTs() {
      op_ts = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'current_ts' field */
    public CharSequence getCurrentTs() {
      return current_ts;
    }
    
    /** Sets the value of the 'current_ts' field */
    public tables.tab2.TAB2.Builder setCurrentTs(CharSequence value) {
      validate(fields()[3], value);
      this.current_ts = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'current_ts' field has been set */
    public boolean hasCurrentTs() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'current_ts' field */
    public tables.tab2.TAB2.Builder clearCurrentTs() {
      current_ts = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'pos' field */
    public CharSequence getPos() {
      return pos;
    }
    
    /** Sets the value of the 'pos' field */
    public tables.tab2.TAB2.Builder setPos(CharSequence value) {
      validate(fields()[4], value);
      this.pos = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'pos' field has been set */
    public boolean hasPos() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'pos' field */
    public tables.tab2.TAB2.Builder clearPos() {
      pos = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'primary_keys' field */
    public java.util.List<CharSequence> getPrimaryKeys() {
      return primary_keys;
    }
    
    /** Sets the value of the 'primary_keys' field */
    public tables.tab2.TAB2.Builder setPrimaryKeys(java.util.List<CharSequence> value) {
      validate(fields()[5], value);
      this.primary_keys = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'primary_keys' field has been set */
    public boolean hasPrimaryKeys() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'primary_keys' field */
    public tables.tab2.TAB2.Builder clearPrimaryKeys() {
      primary_keys = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'tokens' field */
    public java.util.Map<CharSequence,CharSequence> getTokens() {
      return tokens;
    }
    
    /** Sets the value of the 'tokens' field */
    public tables.tab2.TAB2.Builder setTokens(java.util.Map<CharSequence,CharSequence> value) {
      validate(fields()[6], value);
      this.tokens = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'tokens' field has been set */
    public boolean hasTokens() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'tokens' field */
    public tables.tab2.TAB2.Builder clearTokens() {
      tokens = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'before' field */
    public tables.tab2.columns getBefore() {
      return before;
    }
    
    /** Sets the value of the 'before' field */
    public tables.tab2.TAB2.Builder setBefore(tables.tab2.columns value) {
      validate(fields()[7], value);
      this.before = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'before' field has been set */
    public boolean hasBefore() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'before' field */
    public tables.tab2.TAB2.Builder clearBefore() {
      before = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'after' field */
    public tables.tab2.columns getAfter() {
      return after;
    }
    
    /** Sets the value of the 'after' field */
    public tables.tab2.TAB2.Builder setAfter(tables.tab2.columns value) {
      validate(fields()[8], value);
      this.after = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'after' field has been set */
    public boolean hasAfter() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'after' field */
    public tables.tab2.TAB2.Builder clearAfter() {
      after = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public TAB2 build() {
      try {
        TAB2 record = new TAB2();
        record.table = fieldSetFlags()[0] ? this.table : (CharSequence) defaultValue(fields()[0]);
        record.op_type = fieldSetFlags()[1] ? this.op_type : (CharSequence) defaultValue(fields()[1]);
        record.op_ts = fieldSetFlags()[2] ? this.op_ts : (CharSequence) defaultValue(fields()[2]);
        record.current_ts = fieldSetFlags()[3] ? this.current_ts : (CharSequence) defaultValue(fields()[3]);
        record.pos = fieldSetFlags()[4] ? this.pos : (CharSequence) defaultValue(fields()[4]);
        record.primary_keys = fieldSetFlags()[5] ? this.primary_keys : (java.util.List<CharSequence>) defaultValue(fields()[5]);
        record.tokens = fieldSetFlags()[6] ? this.tokens : (java.util.Map<CharSequence,CharSequence>) defaultValue(fields()[6]);
        record.before = fieldSetFlags()[7] ? this.before : (tables.tab2.columns) defaultValue(fields()[7]);
        record.after = fieldSetFlags()[8] ? this.after : (tables.tab2.columns) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
