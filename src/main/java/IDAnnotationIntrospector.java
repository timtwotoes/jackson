import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;

public class IDAnnotationIntrospector extends JacksonAnnotationIntrospector {
    @Override
    public ObjectIdInfo findObjectIdInfo(Annotated ann) {
        return new ObjectIdInfo(PropertyName.construct("id"), null, ObjectIdGenerators.IntSequenceGenerator.class, null);
    }

    @Override
    public boolean hasIgnoreMarker(AnnotatedMember m) {
        if (m.getName().equals("id")) {
            return true;
        } else {
            return super.hasIgnoreMarker(m);
        }
    }
}
