# Observer Pattern
____

![alt text](https://github.com/BaptisteMeynier/Observor-Pattern/blob/master/src/common/images/visitor_pattern.png "Visitor scheme")

## Permanent Implementation
Subject contain a classical array of Observer

## MemoryLeak Preventing
This implementation contain a set of WeakHashMap of observer
The WeakHashMap is a ready-made implementation of a map that wraps its keys with weak references. With this change, the observed will not prevent garbage collection of its observers. However, you should always indicate this behavior in your Java docs! It can be quite confusing, if users of your code want to register a permanent observer to your observant like a logging utility to which they do not plan to keep a reference to. For example, Android's OnSharedPreferencesChangeListener uses weak references to is listeners without documenting this feature. This can keep you up at night!