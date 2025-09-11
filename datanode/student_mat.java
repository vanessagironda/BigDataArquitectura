// ORM class for table 'student_mat'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Sep 11 00:47:47 UTC 2025
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class student_mat extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("school", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.school = (String)value;
      }
    });
    setters.put("sex", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.sex = (String)value;
      }
    });
    setters.put("age", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.age = (Integer)value;
      }
    });
    setters.put("address", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.address = (String)value;
      }
    });
    setters.put("famsize", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.famsize = (String)value;
      }
    });
    setters.put("Pstatus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.Pstatus = (String)value;
      }
    });
    setters.put("Medu", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.Medu = (Integer)value;
      }
    });
    setters.put("Fedu", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.Fedu = (Integer)value;
      }
    });
    setters.put("Mjob", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.Mjob = (String)value;
      }
    });
    setters.put("Fjob", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.Fjob = (String)value;
      }
    });
    setters.put("reason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.reason = (String)value;
      }
    });
    setters.put("guardian", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.guardian = (String)value;
      }
    });
    setters.put("traveltime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.traveltime = (Integer)value;
      }
    });
    setters.put("studytime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.studytime = (Integer)value;
      }
    });
    setters.put("failures", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.failures = (Integer)value;
      }
    });
    setters.put("schoolsup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.schoolsup = (String)value;
      }
    });
    setters.put("famsup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.famsup = (String)value;
      }
    });
    setters.put("paid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.paid = (String)value;
      }
    });
    setters.put("activities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.activities = (String)value;
      }
    });
    setters.put("nursery", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.nursery = (String)value;
      }
    });
    setters.put("higher", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.higher = (String)value;
      }
    });
    setters.put("internet", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.internet = (String)value;
      }
    });
    setters.put("romantic", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.romantic = (String)value;
      }
    });
    setters.put("famrel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.famrel = (Integer)value;
      }
    });
    setters.put("freetime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.freetime = (Integer)value;
      }
    });
    setters.put("goout", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.goout = (Integer)value;
      }
    });
    setters.put("Dalc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.Dalc = (Integer)value;
      }
    });
    setters.put("Walc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.Walc = (Integer)value;
      }
    });
    setters.put("health", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.health = (Integer)value;
      }
    });
    setters.put("absences", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.absences = (Integer)value;
      }
    });
    setters.put("G1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.G1 = (Integer)value;
      }
    });
    setters.put("G2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.G2 = (Integer)value;
      }
    });
    setters.put("G3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        student_mat.this.G3 = (Integer)value;
      }
    });
  }
  public student_mat() {
    init0();
  }
  private String school;
  public String get_school() {
    return school;
  }
  public void set_school(String school) {
    this.school = school;
  }
  public student_mat with_school(String school) {
    this.school = school;
    return this;
  }
  private String sex;
  public String get_sex() {
    return sex;
  }
  public void set_sex(String sex) {
    this.sex = sex;
  }
  public student_mat with_sex(String sex) {
    this.sex = sex;
    return this;
  }
  private Integer age;
  public Integer get_age() {
    return age;
  }
  public void set_age(Integer age) {
    this.age = age;
  }
  public student_mat with_age(Integer age) {
    this.age = age;
    return this;
  }
  private String address;
  public String get_address() {
    return address;
  }
  public void set_address(String address) {
    this.address = address;
  }
  public student_mat with_address(String address) {
    this.address = address;
    return this;
  }
  private String famsize;
  public String get_famsize() {
    return famsize;
  }
  public void set_famsize(String famsize) {
    this.famsize = famsize;
  }
  public student_mat with_famsize(String famsize) {
    this.famsize = famsize;
    return this;
  }
  private String Pstatus;
  public String get_Pstatus() {
    return Pstatus;
  }
  public void set_Pstatus(String Pstatus) {
    this.Pstatus = Pstatus;
  }
  public student_mat with_Pstatus(String Pstatus) {
    this.Pstatus = Pstatus;
    return this;
  }
  private Integer Medu;
  public Integer get_Medu() {
    return Medu;
  }
  public void set_Medu(Integer Medu) {
    this.Medu = Medu;
  }
  public student_mat with_Medu(Integer Medu) {
    this.Medu = Medu;
    return this;
  }
  private Integer Fedu;
  public Integer get_Fedu() {
    return Fedu;
  }
  public void set_Fedu(Integer Fedu) {
    this.Fedu = Fedu;
  }
  public student_mat with_Fedu(Integer Fedu) {
    this.Fedu = Fedu;
    return this;
  }
  private String Mjob;
  public String get_Mjob() {
    return Mjob;
  }
  public void set_Mjob(String Mjob) {
    this.Mjob = Mjob;
  }
  public student_mat with_Mjob(String Mjob) {
    this.Mjob = Mjob;
    return this;
  }
  private String Fjob;
  public String get_Fjob() {
    return Fjob;
  }
  public void set_Fjob(String Fjob) {
    this.Fjob = Fjob;
  }
  public student_mat with_Fjob(String Fjob) {
    this.Fjob = Fjob;
    return this;
  }
  private String reason;
  public String get_reason() {
    return reason;
  }
  public void set_reason(String reason) {
    this.reason = reason;
  }
  public student_mat with_reason(String reason) {
    this.reason = reason;
    return this;
  }
  private String guardian;
  public String get_guardian() {
    return guardian;
  }
  public void set_guardian(String guardian) {
    this.guardian = guardian;
  }
  public student_mat with_guardian(String guardian) {
    this.guardian = guardian;
    return this;
  }
  private Integer traveltime;
  public Integer get_traveltime() {
    return traveltime;
  }
  public void set_traveltime(Integer traveltime) {
    this.traveltime = traveltime;
  }
  public student_mat with_traveltime(Integer traveltime) {
    this.traveltime = traveltime;
    return this;
  }
  private Integer studytime;
  public Integer get_studytime() {
    return studytime;
  }
  public void set_studytime(Integer studytime) {
    this.studytime = studytime;
  }
  public student_mat with_studytime(Integer studytime) {
    this.studytime = studytime;
    return this;
  }
  private Integer failures;
  public Integer get_failures() {
    return failures;
  }
  public void set_failures(Integer failures) {
    this.failures = failures;
  }
  public student_mat with_failures(Integer failures) {
    this.failures = failures;
    return this;
  }
  private String schoolsup;
  public String get_schoolsup() {
    return schoolsup;
  }
  public void set_schoolsup(String schoolsup) {
    this.schoolsup = schoolsup;
  }
  public student_mat with_schoolsup(String schoolsup) {
    this.schoolsup = schoolsup;
    return this;
  }
  private String famsup;
  public String get_famsup() {
    return famsup;
  }
  public void set_famsup(String famsup) {
    this.famsup = famsup;
  }
  public student_mat with_famsup(String famsup) {
    this.famsup = famsup;
    return this;
  }
  private String paid;
  public String get_paid() {
    return paid;
  }
  public void set_paid(String paid) {
    this.paid = paid;
  }
  public student_mat with_paid(String paid) {
    this.paid = paid;
    return this;
  }
  private String activities;
  public String get_activities() {
    return activities;
  }
  public void set_activities(String activities) {
    this.activities = activities;
  }
  public student_mat with_activities(String activities) {
    this.activities = activities;
    return this;
  }
  private String nursery;
  public String get_nursery() {
    return nursery;
  }
  public void set_nursery(String nursery) {
    this.nursery = nursery;
  }
  public student_mat with_nursery(String nursery) {
    this.nursery = nursery;
    return this;
  }
  private String higher;
  public String get_higher() {
    return higher;
  }
  public void set_higher(String higher) {
    this.higher = higher;
  }
  public student_mat with_higher(String higher) {
    this.higher = higher;
    return this;
  }
  private String internet;
  public String get_internet() {
    return internet;
  }
  public void set_internet(String internet) {
    this.internet = internet;
  }
  public student_mat with_internet(String internet) {
    this.internet = internet;
    return this;
  }
  private String romantic;
  public String get_romantic() {
    return romantic;
  }
  public void set_romantic(String romantic) {
    this.romantic = romantic;
  }
  public student_mat with_romantic(String romantic) {
    this.romantic = romantic;
    return this;
  }
  private Integer famrel;
  public Integer get_famrel() {
    return famrel;
  }
  public void set_famrel(Integer famrel) {
    this.famrel = famrel;
  }
  public student_mat with_famrel(Integer famrel) {
    this.famrel = famrel;
    return this;
  }
  private Integer freetime;
  public Integer get_freetime() {
    return freetime;
  }
  public void set_freetime(Integer freetime) {
    this.freetime = freetime;
  }
  public student_mat with_freetime(Integer freetime) {
    this.freetime = freetime;
    return this;
  }
  private Integer goout;
  public Integer get_goout() {
    return goout;
  }
  public void set_goout(Integer goout) {
    this.goout = goout;
  }
  public student_mat with_goout(Integer goout) {
    this.goout = goout;
    return this;
  }
  private Integer Dalc;
  public Integer get_Dalc() {
    return Dalc;
  }
  public void set_Dalc(Integer Dalc) {
    this.Dalc = Dalc;
  }
  public student_mat with_Dalc(Integer Dalc) {
    this.Dalc = Dalc;
    return this;
  }
  private Integer Walc;
  public Integer get_Walc() {
    return Walc;
  }
  public void set_Walc(Integer Walc) {
    this.Walc = Walc;
  }
  public student_mat with_Walc(Integer Walc) {
    this.Walc = Walc;
    return this;
  }
  private Integer health;
  public Integer get_health() {
    return health;
  }
  public void set_health(Integer health) {
    this.health = health;
  }
  public student_mat with_health(Integer health) {
    this.health = health;
    return this;
  }
  private Integer absences;
  public Integer get_absences() {
    return absences;
  }
  public void set_absences(Integer absences) {
    this.absences = absences;
  }
  public student_mat with_absences(Integer absences) {
    this.absences = absences;
    return this;
  }
  private Integer G1;
  public Integer get_G1() {
    return G1;
  }
  public void set_G1(Integer G1) {
    this.G1 = G1;
  }
  public student_mat with_G1(Integer G1) {
    this.G1 = G1;
    return this;
  }
  private Integer G2;
  public Integer get_G2() {
    return G2;
  }
  public void set_G2(Integer G2) {
    this.G2 = G2;
  }
  public student_mat with_G2(Integer G2) {
    this.G2 = G2;
    return this;
  }
  private Integer G3;
  public Integer get_G3() {
    return G3;
  }
  public void set_G3(Integer G3) {
    this.G3 = G3;
  }
  public student_mat with_G3(Integer G3) {
    this.G3 = G3;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof student_mat)) {
      return false;
    }
    student_mat that = (student_mat) o;
    boolean equal = true;
    equal = equal && (this.school == null ? that.school == null : this.school.equals(that.school));
    equal = equal && (this.sex == null ? that.sex == null : this.sex.equals(that.sex));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.famsize == null ? that.famsize == null : this.famsize.equals(that.famsize));
    equal = equal && (this.Pstatus == null ? that.Pstatus == null : this.Pstatus.equals(that.Pstatus));
    equal = equal && (this.Medu == null ? that.Medu == null : this.Medu.equals(that.Medu));
    equal = equal && (this.Fedu == null ? that.Fedu == null : this.Fedu.equals(that.Fedu));
    equal = equal && (this.Mjob == null ? that.Mjob == null : this.Mjob.equals(that.Mjob));
    equal = equal && (this.Fjob == null ? that.Fjob == null : this.Fjob.equals(that.Fjob));
    equal = equal && (this.reason == null ? that.reason == null : this.reason.equals(that.reason));
    equal = equal && (this.guardian == null ? that.guardian == null : this.guardian.equals(that.guardian));
    equal = equal && (this.traveltime == null ? that.traveltime == null : this.traveltime.equals(that.traveltime));
    equal = equal && (this.studytime == null ? that.studytime == null : this.studytime.equals(that.studytime));
    equal = equal && (this.failures == null ? that.failures == null : this.failures.equals(that.failures));
    equal = equal && (this.schoolsup == null ? that.schoolsup == null : this.schoolsup.equals(that.schoolsup));
    equal = equal && (this.famsup == null ? that.famsup == null : this.famsup.equals(that.famsup));
    equal = equal && (this.paid == null ? that.paid == null : this.paid.equals(that.paid));
    equal = equal && (this.activities == null ? that.activities == null : this.activities.equals(that.activities));
    equal = equal && (this.nursery == null ? that.nursery == null : this.nursery.equals(that.nursery));
    equal = equal && (this.higher == null ? that.higher == null : this.higher.equals(that.higher));
    equal = equal && (this.internet == null ? that.internet == null : this.internet.equals(that.internet));
    equal = equal && (this.romantic == null ? that.romantic == null : this.romantic.equals(that.romantic));
    equal = equal && (this.famrel == null ? that.famrel == null : this.famrel.equals(that.famrel));
    equal = equal && (this.freetime == null ? that.freetime == null : this.freetime.equals(that.freetime));
    equal = equal && (this.goout == null ? that.goout == null : this.goout.equals(that.goout));
    equal = equal && (this.Dalc == null ? that.Dalc == null : this.Dalc.equals(that.Dalc));
    equal = equal && (this.Walc == null ? that.Walc == null : this.Walc.equals(that.Walc));
    equal = equal && (this.health == null ? that.health == null : this.health.equals(that.health));
    equal = equal && (this.absences == null ? that.absences == null : this.absences.equals(that.absences));
    equal = equal && (this.G1 == null ? that.G1 == null : this.G1.equals(that.G1));
    equal = equal && (this.G2 == null ? that.G2 == null : this.G2.equals(that.G2));
    equal = equal && (this.G3 == null ? that.G3 == null : this.G3.equals(that.G3));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof student_mat)) {
      return false;
    }
    student_mat that = (student_mat) o;
    boolean equal = true;
    equal = equal && (this.school == null ? that.school == null : this.school.equals(that.school));
    equal = equal && (this.sex == null ? that.sex == null : this.sex.equals(that.sex));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.famsize == null ? that.famsize == null : this.famsize.equals(that.famsize));
    equal = equal && (this.Pstatus == null ? that.Pstatus == null : this.Pstatus.equals(that.Pstatus));
    equal = equal && (this.Medu == null ? that.Medu == null : this.Medu.equals(that.Medu));
    equal = equal && (this.Fedu == null ? that.Fedu == null : this.Fedu.equals(that.Fedu));
    equal = equal && (this.Mjob == null ? that.Mjob == null : this.Mjob.equals(that.Mjob));
    equal = equal && (this.Fjob == null ? that.Fjob == null : this.Fjob.equals(that.Fjob));
    equal = equal && (this.reason == null ? that.reason == null : this.reason.equals(that.reason));
    equal = equal && (this.guardian == null ? that.guardian == null : this.guardian.equals(that.guardian));
    equal = equal && (this.traveltime == null ? that.traveltime == null : this.traveltime.equals(that.traveltime));
    equal = equal && (this.studytime == null ? that.studytime == null : this.studytime.equals(that.studytime));
    equal = equal && (this.failures == null ? that.failures == null : this.failures.equals(that.failures));
    equal = equal && (this.schoolsup == null ? that.schoolsup == null : this.schoolsup.equals(that.schoolsup));
    equal = equal && (this.famsup == null ? that.famsup == null : this.famsup.equals(that.famsup));
    equal = equal && (this.paid == null ? that.paid == null : this.paid.equals(that.paid));
    equal = equal && (this.activities == null ? that.activities == null : this.activities.equals(that.activities));
    equal = equal && (this.nursery == null ? that.nursery == null : this.nursery.equals(that.nursery));
    equal = equal && (this.higher == null ? that.higher == null : this.higher.equals(that.higher));
    equal = equal && (this.internet == null ? that.internet == null : this.internet.equals(that.internet));
    equal = equal && (this.romantic == null ? that.romantic == null : this.romantic.equals(that.romantic));
    equal = equal && (this.famrel == null ? that.famrel == null : this.famrel.equals(that.famrel));
    equal = equal && (this.freetime == null ? that.freetime == null : this.freetime.equals(that.freetime));
    equal = equal && (this.goout == null ? that.goout == null : this.goout.equals(that.goout));
    equal = equal && (this.Dalc == null ? that.Dalc == null : this.Dalc.equals(that.Dalc));
    equal = equal && (this.Walc == null ? that.Walc == null : this.Walc.equals(that.Walc));
    equal = equal && (this.health == null ? that.health == null : this.health.equals(that.health));
    equal = equal && (this.absences == null ? that.absences == null : this.absences.equals(that.absences));
    equal = equal && (this.G1 == null ? that.G1 == null : this.G1.equals(that.G1));
    equal = equal && (this.G2 == null ? that.G2 == null : this.G2.equals(that.G2));
    equal = equal && (this.G3 == null ? that.G3 == null : this.G3.equals(that.G3));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.school = JdbcWritableBridge.readString(1, __dbResults);
    this.sex = JdbcWritableBridge.readString(2, __dbResults);
    this.age = JdbcWritableBridge.readInteger(3, __dbResults);
    this.address = JdbcWritableBridge.readString(4, __dbResults);
    this.famsize = JdbcWritableBridge.readString(5, __dbResults);
    this.Pstatus = JdbcWritableBridge.readString(6, __dbResults);
    this.Medu = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Fedu = JdbcWritableBridge.readInteger(8, __dbResults);
    this.Mjob = JdbcWritableBridge.readString(9, __dbResults);
    this.Fjob = JdbcWritableBridge.readString(10, __dbResults);
    this.reason = JdbcWritableBridge.readString(11, __dbResults);
    this.guardian = JdbcWritableBridge.readString(12, __dbResults);
    this.traveltime = JdbcWritableBridge.readInteger(13, __dbResults);
    this.studytime = JdbcWritableBridge.readInteger(14, __dbResults);
    this.failures = JdbcWritableBridge.readInteger(15, __dbResults);
    this.schoolsup = JdbcWritableBridge.readString(16, __dbResults);
    this.famsup = JdbcWritableBridge.readString(17, __dbResults);
    this.paid = JdbcWritableBridge.readString(18, __dbResults);
    this.activities = JdbcWritableBridge.readString(19, __dbResults);
    this.nursery = JdbcWritableBridge.readString(20, __dbResults);
    this.higher = JdbcWritableBridge.readString(21, __dbResults);
    this.internet = JdbcWritableBridge.readString(22, __dbResults);
    this.romantic = JdbcWritableBridge.readString(23, __dbResults);
    this.famrel = JdbcWritableBridge.readInteger(24, __dbResults);
    this.freetime = JdbcWritableBridge.readInteger(25, __dbResults);
    this.goout = JdbcWritableBridge.readInteger(26, __dbResults);
    this.Dalc = JdbcWritableBridge.readInteger(27, __dbResults);
    this.Walc = JdbcWritableBridge.readInteger(28, __dbResults);
    this.health = JdbcWritableBridge.readInteger(29, __dbResults);
    this.absences = JdbcWritableBridge.readInteger(30, __dbResults);
    this.G1 = JdbcWritableBridge.readInteger(31, __dbResults);
    this.G2 = JdbcWritableBridge.readInteger(32, __dbResults);
    this.G3 = JdbcWritableBridge.readInteger(33, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.school = JdbcWritableBridge.readString(1, __dbResults);
    this.sex = JdbcWritableBridge.readString(2, __dbResults);
    this.age = JdbcWritableBridge.readInteger(3, __dbResults);
    this.address = JdbcWritableBridge.readString(4, __dbResults);
    this.famsize = JdbcWritableBridge.readString(5, __dbResults);
    this.Pstatus = JdbcWritableBridge.readString(6, __dbResults);
    this.Medu = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Fedu = JdbcWritableBridge.readInteger(8, __dbResults);
    this.Mjob = JdbcWritableBridge.readString(9, __dbResults);
    this.Fjob = JdbcWritableBridge.readString(10, __dbResults);
    this.reason = JdbcWritableBridge.readString(11, __dbResults);
    this.guardian = JdbcWritableBridge.readString(12, __dbResults);
    this.traveltime = JdbcWritableBridge.readInteger(13, __dbResults);
    this.studytime = JdbcWritableBridge.readInteger(14, __dbResults);
    this.failures = JdbcWritableBridge.readInteger(15, __dbResults);
    this.schoolsup = JdbcWritableBridge.readString(16, __dbResults);
    this.famsup = JdbcWritableBridge.readString(17, __dbResults);
    this.paid = JdbcWritableBridge.readString(18, __dbResults);
    this.activities = JdbcWritableBridge.readString(19, __dbResults);
    this.nursery = JdbcWritableBridge.readString(20, __dbResults);
    this.higher = JdbcWritableBridge.readString(21, __dbResults);
    this.internet = JdbcWritableBridge.readString(22, __dbResults);
    this.romantic = JdbcWritableBridge.readString(23, __dbResults);
    this.famrel = JdbcWritableBridge.readInteger(24, __dbResults);
    this.freetime = JdbcWritableBridge.readInteger(25, __dbResults);
    this.goout = JdbcWritableBridge.readInteger(26, __dbResults);
    this.Dalc = JdbcWritableBridge.readInteger(27, __dbResults);
    this.Walc = JdbcWritableBridge.readInteger(28, __dbResults);
    this.health = JdbcWritableBridge.readInteger(29, __dbResults);
    this.absences = JdbcWritableBridge.readInteger(30, __dbResults);
    this.G1 = JdbcWritableBridge.readInteger(31, __dbResults);
    this.G2 = JdbcWritableBridge.readInteger(32, __dbResults);
    this.G3 = JdbcWritableBridge.readInteger(33, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(school, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sex, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(age, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(address, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(famsize, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Pstatus, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Medu, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Fedu, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Mjob, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Fjob, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reason, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(guardian, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(traveltime, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(studytime, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(failures, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(schoolsup, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(famsup, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(paid, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(activities, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(nursery, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(higher, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(internet, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(romantic, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(famrel, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(freetime, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(goout, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Dalc, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Walc, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(health, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(absences, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(G1, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(G2, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(G3, 33 + __off, 4, __dbStmt);
    return 33;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(school, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sex, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(age, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(address, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(famsize, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Pstatus, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Medu, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Fedu, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Mjob, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Fjob, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reason, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(guardian, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(traveltime, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(studytime, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(failures, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(schoolsup, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(famsup, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(paid, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(activities, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(nursery, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(higher, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(internet, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(romantic, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(famrel, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(freetime, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(goout, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Dalc, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Walc, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(health, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(absences, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(G1, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(G2, 32 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(G3, 33 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.school = null;
    } else {
    this.school = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sex = null;
    } else {
    this.sex = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.age = null;
    } else {
    this.age = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.address = null;
    } else {
    this.address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.famsize = null;
    } else {
    this.famsize = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Pstatus = null;
    } else {
    this.Pstatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Medu = null;
    } else {
    this.Medu = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Fedu = null;
    } else {
    this.Fedu = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Mjob = null;
    } else {
    this.Mjob = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Fjob = null;
    } else {
    this.Fjob = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reason = null;
    } else {
    this.reason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.guardian = null;
    } else {
    this.guardian = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.traveltime = null;
    } else {
    this.traveltime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.studytime = null;
    } else {
    this.studytime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.failures = null;
    } else {
    this.failures = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.schoolsup = null;
    } else {
    this.schoolsup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.famsup = null;
    } else {
    this.famsup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.paid = null;
    } else {
    this.paid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.activities = null;
    } else {
    this.activities = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.nursery = null;
    } else {
    this.nursery = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.higher = null;
    } else {
    this.higher = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.internet = null;
    } else {
    this.internet = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.romantic = null;
    } else {
    this.romantic = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.famrel = null;
    } else {
    this.famrel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.freetime = null;
    } else {
    this.freetime = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.goout = null;
    } else {
    this.goout = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Dalc = null;
    } else {
    this.Dalc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Walc = null;
    } else {
    this.Walc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.health = null;
    } else {
    this.health = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.absences = null;
    } else {
    this.absences = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.G1 = null;
    } else {
    this.G1 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.G2 = null;
    } else {
    this.G2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.G3 = null;
    } else {
    this.G3 = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.school) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, school);
    }
    if (null == this.sex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sex);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.age);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.famsize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, famsize);
    }
    if (null == this.Pstatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Pstatus);
    }
    if (null == this.Medu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Medu);
    }
    if (null == this.Fedu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Fedu);
    }
    if (null == this.Mjob) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Mjob);
    }
    if (null == this.Fjob) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Fjob);
    }
    if (null == this.reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reason);
    }
    if (null == this.guardian) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, guardian);
    }
    if (null == this.traveltime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.traveltime);
    }
    if (null == this.studytime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.studytime);
    }
    if (null == this.failures) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.failures);
    }
    if (null == this.schoolsup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, schoolsup);
    }
    if (null == this.famsup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, famsup);
    }
    if (null == this.paid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, paid);
    }
    if (null == this.activities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, activities);
    }
    if (null == this.nursery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nursery);
    }
    if (null == this.higher) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, higher);
    }
    if (null == this.internet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, internet);
    }
    if (null == this.romantic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, romantic);
    }
    if (null == this.famrel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.famrel);
    }
    if (null == this.freetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.freetime);
    }
    if (null == this.goout) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.goout);
    }
    if (null == this.Dalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Dalc);
    }
    if (null == this.Walc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Walc);
    }
    if (null == this.health) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.health);
    }
    if (null == this.absences) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.absences);
    }
    if (null == this.G1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.G1);
    }
    if (null == this.G2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.G2);
    }
    if (null == this.G3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.G3);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.school) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, school);
    }
    if (null == this.sex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sex);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.age);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.famsize) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, famsize);
    }
    if (null == this.Pstatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Pstatus);
    }
    if (null == this.Medu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Medu);
    }
    if (null == this.Fedu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Fedu);
    }
    if (null == this.Mjob) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Mjob);
    }
    if (null == this.Fjob) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Fjob);
    }
    if (null == this.reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reason);
    }
    if (null == this.guardian) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, guardian);
    }
    if (null == this.traveltime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.traveltime);
    }
    if (null == this.studytime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.studytime);
    }
    if (null == this.failures) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.failures);
    }
    if (null == this.schoolsup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, schoolsup);
    }
    if (null == this.famsup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, famsup);
    }
    if (null == this.paid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, paid);
    }
    if (null == this.activities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, activities);
    }
    if (null == this.nursery) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nursery);
    }
    if (null == this.higher) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, higher);
    }
    if (null == this.internet) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, internet);
    }
    if (null == this.romantic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, romantic);
    }
    if (null == this.famrel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.famrel);
    }
    if (null == this.freetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.freetime);
    }
    if (null == this.goout) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.goout);
    }
    if (null == this.Dalc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Dalc);
    }
    if (null == this.Walc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Walc);
    }
    if (null == this.health) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.health);
    }
    if (null == this.absences) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.absences);
    }
    if (null == this.G1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.G1);
    }
    if (null == this.G2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.G2);
    }
    if (null == this.G3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.G3);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(school==null?"null":school, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sex==null?"null":sex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":"" + age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(famsize==null?"null":famsize, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pstatus==null?"null":Pstatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Medu==null?"null":"" + Medu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Fedu==null?"null":"" + Fedu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Mjob==null?"null":Mjob, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Fjob==null?"null":Fjob, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reason==null?"null":reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(guardian==null?"null":guardian, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(traveltime==null?"null":"" + traveltime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(studytime==null?"null":"" + studytime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(failures==null?"null":"" + failures, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(schoolsup==null?"null":schoolsup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(famsup==null?"null":famsup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(paid==null?"null":paid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(activities==null?"null":activities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nursery==null?"null":nursery, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(higher==null?"null":higher, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(internet==null?"null":internet, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(romantic==null?"null":romantic, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(famrel==null?"null":"" + famrel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freetime==null?"null":"" + freetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(goout==null?"null":"" + goout, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dalc==null?"null":"" + Dalc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Walc==null?"null":"" + Walc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(health==null?"null":"" + health, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(absences==null?"null":"" + absences, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(G1==null?"null":"" + G1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(G2==null?"null":"" + G2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(G3==null?"null":"" + G3, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(school==null?"null":school, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sex==null?"null":sex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":"" + age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(famsize==null?"null":famsize, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Pstatus==null?"null":Pstatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Medu==null?"null":"" + Medu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Fedu==null?"null":"" + Fedu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Mjob==null?"null":Mjob, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Fjob==null?"null":Fjob, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reason==null?"null":reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(guardian==null?"null":guardian, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(traveltime==null?"null":"" + traveltime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(studytime==null?"null":"" + studytime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(failures==null?"null":"" + failures, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(schoolsup==null?"null":schoolsup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(famsup==null?"null":famsup, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(paid==null?"null":paid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(activities==null?"null":activities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nursery==null?"null":nursery, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(higher==null?"null":higher, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(internet==null?"null":internet, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(romantic==null?"null":romantic, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(famrel==null?"null":"" + famrel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(freetime==null?"null":"" + freetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(goout==null?"null":"" + goout, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Dalc==null?"null":"" + Dalc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Walc==null?"null":"" + Walc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(health==null?"null":"" + health, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(absences==null?"null":"" + absences, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(G1==null?"null":"" + G1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(G2==null?"null":"" + G2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(G3==null?"null":"" + G3, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.school = null; } else {
      this.school = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sex = null; } else {
      this.sex = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.age = null; } else {
      this.age = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.famsize = null; } else {
      this.famsize = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Pstatus = null; } else {
      this.Pstatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Medu = null; } else {
      this.Medu = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Fedu = null; } else {
      this.Fedu = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Mjob = null; } else {
      this.Mjob = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Fjob = null; } else {
      this.Fjob = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reason = null; } else {
      this.reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.guardian = null; } else {
      this.guardian = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.traveltime = null; } else {
      this.traveltime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.studytime = null; } else {
      this.studytime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.failures = null; } else {
      this.failures = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.schoolsup = null; } else {
      this.schoolsup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.famsup = null; } else {
      this.famsup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.paid = null; } else {
      this.paid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.activities = null; } else {
      this.activities = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.nursery = null; } else {
      this.nursery = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.higher = null; } else {
      this.higher = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.internet = null; } else {
      this.internet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.romantic = null; } else {
      this.romantic = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.famrel = null; } else {
      this.famrel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.freetime = null; } else {
      this.freetime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.goout = null; } else {
      this.goout = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Dalc = null; } else {
      this.Dalc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Walc = null; } else {
      this.Walc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.health = null; } else {
      this.health = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.absences = null; } else {
      this.absences = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.G1 = null; } else {
      this.G1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.G2 = null; } else {
      this.G2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.G3 = null; } else {
      this.G3 = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.school = null; } else {
      this.school = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sex = null; } else {
      this.sex = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.age = null; } else {
      this.age = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.famsize = null; } else {
      this.famsize = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Pstatus = null; } else {
      this.Pstatus = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Medu = null; } else {
      this.Medu = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Fedu = null; } else {
      this.Fedu = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Mjob = null; } else {
      this.Mjob = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.Fjob = null; } else {
      this.Fjob = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reason = null; } else {
      this.reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.guardian = null; } else {
      this.guardian = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.traveltime = null; } else {
      this.traveltime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.studytime = null; } else {
      this.studytime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.failures = null; } else {
      this.failures = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.schoolsup = null; } else {
      this.schoolsup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.famsup = null; } else {
      this.famsup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.paid = null; } else {
      this.paid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.activities = null; } else {
      this.activities = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.nursery = null; } else {
      this.nursery = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.higher = null; } else {
      this.higher = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.internet = null; } else {
      this.internet = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.romantic = null; } else {
      this.romantic = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.famrel = null; } else {
      this.famrel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.freetime = null; } else {
      this.freetime = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.goout = null; } else {
      this.goout = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Dalc = null; } else {
      this.Dalc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Walc = null; } else {
      this.Walc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.health = null; } else {
      this.health = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.absences = null; } else {
      this.absences = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.G1 = null; } else {
      this.G1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.G2 = null; } else {
      this.G2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.G3 = null; } else {
      this.G3 = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    student_mat o = (student_mat) super.clone();
    return o;
  }

  public void clone0(student_mat o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("school", this.school);
    __sqoop$field_map.put("sex", this.sex);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("famsize", this.famsize);
    __sqoop$field_map.put("Pstatus", this.Pstatus);
    __sqoop$field_map.put("Medu", this.Medu);
    __sqoop$field_map.put("Fedu", this.Fedu);
    __sqoop$field_map.put("Mjob", this.Mjob);
    __sqoop$field_map.put("Fjob", this.Fjob);
    __sqoop$field_map.put("reason", this.reason);
    __sqoop$field_map.put("guardian", this.guardian);
    __sqoop$field_map.put("traveltime", this.traveltime);
    __sqoop$field_map.put("studytime", this.studytime);
    __sqoop$field_map.put("failures", this.failures);
    __sqoop$field_map.put("schoolsup", this.schoolsup);
    __sqoop$field_map.put("famsup", this.famsup);
    __sqoop$field_map.put("paid", this.paid);
    __sqoop$field_map.put("activities", this.activities);
    __sqoop$field_map.put("nursery", this.nursery);
    __sqoop$field_map.put("higher", this.higher);
    __sqoop$field_map.put("internet", this.internet);
    __sqoop$field_map.put("romantic", this.romantic);
    __sqoop$field_map.put("famrel", this.famrel);
    __sqoop$field_map.put("freetime", this.freetime);
    __sqoop$field_map.put("goout", this.goout);
    __sqoop$field_map.put("Dalc", this.Dalc);
    __sqoop$field_map.put("Walc", this.Walc);
    __sqoop$field_map.put("health", this.health);
    __sqoop$field_map.put("absences", this.absences);
    __sqoop$field_map.put("G1", this.G1);
    __sqoop$field_map.put("G2", this.G2);
    __sqoop$field_map.put("G3", this.G3);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("school", this.school);
    __sqoop$field_map.put("sex", this.sex);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("famsize", this.famsize);
    __sqoop$field_map.put("Pstatus", this.Pstatus);
    __sqoop$field_map.put("Medu", this.Medu);
    __sqoop$field_map.put("Fedu", this.Fedu);
    __sqoop$field_map.put("Mjob", this.Mjob);
    __sqoop$field_map.put("Fjob", this.Fjob);
    __sqoop$field_map.put("reason", this.reason);
    __sqoop$field_map.put("guardian", this.guardian);
    __sqoop$field_map.put("traveltime", this.traveltime);
    __sqoop$field_map.put("studytime", this.studytime);
    __sqoop$field_map.put("failures", this.failures);
    __sqoop$field_map.put("schoolsup", this.schoolsup);
    __sqoop$field_map.put("famsup", this.famsup);
    __sqoop$field_map.put("paid", this.paid);
    __sqoop$field_map.put("activities", this.activities);
    __sqoop$field_map.put("nursery", this.nursery);
    __sqoop$field_map.put("higher", this.higher);
    __sqoop$field_map.put("internet", this.internet);
    __sqoop$field_map.put("romantic", this.romantic);
    __sqoop$field_map.put("famrel", this.famrel);
    __sqoop$field_map.put("freetime", this.freetime);
    __sqoop$field_map.put("goout", this.goout);
    __sqoop$field_map.put("Dalc", this.Dalc);
    __sqoop$field_map.put("Walc", this.Walc);
    __sqoop$field_map.put("health", this.health);
    __sqoop$field_map.put("absences", this.absences);
    __sqoop$field_map.put("G1", this.G1);
    __sqoop$field_map.put("G2", this.G2);
    __sqoop$field_map.put("G3", this.G3);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
