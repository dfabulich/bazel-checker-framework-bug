java_library(
	name='x',
	srcs=['X.java'],
	deps=['@checker//jar'],
	plugins=['checker'],
)

java_plugin(
	name='checker',
	deps=['@checker//jar'],
	processor_class='org.checkerframework.checker.nullness.NullnessChecker',
)