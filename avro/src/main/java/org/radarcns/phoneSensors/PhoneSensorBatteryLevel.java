/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.radarcns.phoneSensors;  
@SuppressWarnings("all")
/** Phone battery level. */
@org.apache.avro.specific.AvroGenerated
public class PhoneSensorBatteryLevel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PhoneSensorBatteryLevel\",\"namespace\":\"org.radarcns.phoneSensors\",\"doc\":\"Phone battery level.\",\"fields\":[{\"name\":\"time\",\"type\":\"double\",\"doc\":\"device timestamp in UTC (s)\"},{\"name\":\"timeReceived\",\"type\":\"double\",\"doc\":\"device receiver timestamp in UTC (s)\"},{\"name\":\"batteryLevel\",\"type\":\"float\",\"doc\":\"battery level from 0 to 1\"},{\"name\":\"isPlugged\",\"type\":\"boolean\",\"doc\":\"whether the phone is connected to a power source\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** device timestamp in UTC (s) */
  @Deprecated public double time;
  /** device receiver timestamp in UTC (s) */
  @Deprecated public double timeReceived;
  /** battery level from 0 to 1 */
  @Deprecated public float batteryLevel;
  /** whether the phone is connected to a power source */
  @Deprecated public boolean isPlugged;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public PhoneSensorBatteryLevel() {}

  /**
   * All-args constructor.
   */
  public PhoneSensorBatteryLevel(java.lang.Double time, java.lang.Double timeReceived, java.lang.Float batteryLevel, java.lang.Boolean isPlugged) {
    this.time = time;
    this.timeReceived = timeReceived;
    this.batteryLevel = batteryLevel;
    this.isPlugged = isPlugged;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return time;
    case 1: return timeReceived;
    case 2: return batteryLevel;
    case 3: return isPlugged;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: time = (java.lang.Double)value$; break;
    case 1: timeReceived = (java.lang.Double)value$; break;
    case 2: batteryLevel = (java.lang.Float)value$; break;
    case 3: isPlugged = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'time' field.
   * device timestamp in UTC (s)   */
  public java.lang.Double getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * device timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTime(java.lang.Double value) {
    this.time = value;
  }

  /**
   * Gets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   */
  public java.lang.Double getTimeReceived() {
    return timeReceived;
  }

  /**
   * Sets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTimeReceived(java.lang.Double value) {
    this.timeReceived = value;
  }

  /**
   * Gets the value of the 'batteryLevel' field.
   * battery level from 0 to 1   */
  public java.lang.Float getBatteryLevel() {
    return batteryLevel;
  }

  /**
   * Sets the value of the 'batteryLevel' field.
   * battery level from 0 to 1   * @param value the value to set.
   */
  public void setBatteryLevel(java.lang.Float value) {
    this.batteryLevel = value;
  }

  /**
   * Gets the value of the 'isPlugged' field.
   * whether the phone is connected to a power source   */
  public java.lang.Boolean getIsPlugged() {
    return isPlugged;
  }

  /**
   * Sets the value of the 'isPlugged' field.
   * whether the phone is connected to a power source   * @param value the value to set.
   */
  public void setIsPlugged(java.lang.Boolean value) {
    this.isPlugged = value;
  }

  /** Creates a new PhoneSensorBatteryLevel RecordBuilder */
  public static org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder newBuilder() {
    return new org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder();
  }
  
  /** Creates a new PhoneSensorBatteryLevel RecordBuilder by copying an existing Builder */
  public static org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder newBuilder(org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder other) {
    return new org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder(other);
  }
  
  /** Creates a new PhoneSensorBatteryLevel RecordBuilder by copying an existing PhoneSensorBatteryLevel instance */
  public static org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder newBuilder(org.radarcns.phoneSensors.PhoneSensorBatteryLevel other) {
    return new org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder(other);
  }
  
  /**
   * RecordBuilder for PhoneSensorBatteryLevel instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PhoneSensorBatteryLevel>
    implements org.apache.avro.data.RecordBuilder<PhoneSensorBatteryLevel> {

    private double time;
    private double timeReceived;
    private float batteryLevel;
    private boolean isPlugged;

    /** Creates a new Builder */
    private Builder() {
      super(org.radarcns.phoneSensors.PhoneSensorBatteryLevel.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.batteryLevel)) {
        this.batteryLevel = data().deepCopy(fields()[2].schema(), other.batteryLevel);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isPlugged)) {
        this.isPlugged = data().deepCopy(fields()[3].schema(), other.isPlugged);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PhoneSensorBatteryLevel instance */
    private Builder(org.radarcns.phoneSensors.PhoneSensorBatteryLevel other) {
            super(org.radarcns.phoneSensors.PhoneSensorBatteryLevel.SCHEMA$);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.batteryLevel)) {
        this.batteryLevel = data().deepCopy(fields()[2].schema(), other.batteryLevel);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.isPlugged)) {
        this.isPlugged = data().deepCopy(fields()[3].schema(), other.isPlugged);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'time' field */
    public java.lang.Double getTime() {
      return time;
    }
    
    /** Sets the value of the 'time' field */
    public org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder setTime(double value) {
      validate(fields()[0], value);
      this.time = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'time' field has been set */
    public boolean hasTime() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'time' field */
    public org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder clearTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timeReceived' field */
    public java.lang.Double getTimeReceived() {
      return timeReceived;
    }
    
    /** Sets the value of the 'timeReceived' field */
    public org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder setTimeReceived(double value) {
      validate(fields()[1], value);
      this.timeReceived = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timeReceived' field has been set */
    public boolean hasTimeReceived() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timeReceived' field */
    public org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder clearTimeReceived() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'batteryLevel' field */
    public java.lang.Float getBatteryLevel() {
      return batteryLevel;
    }
    
    /** Sets the value of the 'batteryLevel' field */
    public org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder setBatteryLevel(float value) {
      validate(fields()[2], value);
      this.batteryLevel = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'batteryLevel' field has been set */
    public boolean hasBatteryLevel() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'batteryLevel' field */
    public org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder clearBatteryLevel() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'isPlugged' field */
    public java.lang.Boolean getIsPlugged() {
      return isPlugged;
    }
    
    /** Sets the value of the 'isPlugged' field */
    public org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder setIsPlugged(boolean value) {
      validate(fields()[3], value);
      this.isPlugged = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'isPlugged' field has been set */
    public boolean hasIsPlugged() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'isPlugged' field */
    public org.radarcns.phoneSensors.PhoneSensorBatteryLevel.Builder clearIsPlugged() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public PhoneSensorBatteryLevel build() {
      try {
        PhoneSensorBatteryLevel record = new PhoneSensorBatteryLevel();
        record.time = fieldSetFlags()[0] ? this.time : (java.lang.Double) defaultValue(fields()[0]);
        record.timeReceived = fieldSetFlags()[1] ? this.timeReceived : (java.lang.Double) defaultValue(fields()[1]);
        record.batteryLevel = fieldSetFlags()[2] ? this.batteryLevel : (java.lang.Float) defaultValue(fields()[2]);
        record.isPlugged = fieldSetFlags()[3] ? this.isPlugged : (java.lang.Boolean) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
