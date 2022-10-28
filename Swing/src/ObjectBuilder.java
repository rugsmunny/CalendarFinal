/*
public class ObjectBuilder {
    public void ObjectBuilder() {
        // Default constructor should exist
        // but only needs to be visible at the
        // BusinessObjectBuilder scope.
        // use whatever access modifier you would
        // prefer, however, based on needs,
        // internal or public is appropriate.
        // in C++, use `friend BusinessObjectBuilder`
    }
    public String object1;

    public String debug;

    public static BusinessObjectBuilder create() {
        return new BusinessObjectBuilder();
    }
}

public class BusinessObjectBuilder {
    protected ObjectBuilder bObject; // the object we will build
    BusinessObjectBuilder() {
        // A default constructor, again minimally visible
        // to BusinessObject; internal or public is good here.
        // Needs to create a basic BusinessObject.
        bObject = new ObjectBuilder();
    }
    public BusinessObjectBuilder debug(String debugString) {
        // Sets BusinessObject.debug
        this.bObject.debug += debugString + "\n";
        // Then returns the BusinessObjectBuilder.
        // Every method should return this except the facade methods
        // and the build method.
        return this;
    }
    public CalenderObjectBuilder team1Object() {
        // Returns the Team1Object builder facet.
        return new CalendarObjectBuilder(this.bObject);
    }

    public BusinessObject build() {
        // Technically, it's already built at this point. Return it.
        return this.bObject;
    }
}

public class CalendarObjectBuilder extends BusinessObjectBuilder {
    private BusinessObject bObject; // the object we will build
    internal Team1ObjectBuilder(BusinessObject bObject) {
        // This time we copy the object we were building
        this.bObject = bObject;
    }
    private Team1Object somehowComputeObject1() {
        // pour on the magic
        return new Team1Object();
    }
    public Team1ObjectBuilder append(Context someApplicationContext) {
        this.bObject.object1 = somehowComputeObject1();
    }
}

public class Team2ObjectBuilder extends BusinessObjectBuilder {
    private BusinessObject bObject; // the object we will build
    internal Team2ObjectBuilder(BusinessObject bObject) {
        // Again we copy the object we were building
        this.bObject = bObject;
    }
    private Team2Object somehowComputeObject2() {
        // pour on the magic
        return new Team2Object();
    }
    public Team2ObjectBuilder append(Context someApplicationContext) {
        this.bObject.object2 = somehowComputeObject2();
    }
}*/
