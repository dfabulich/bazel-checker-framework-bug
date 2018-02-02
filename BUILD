java_library(
	name='x',
	srcs=['X.java'],
	deps=['@jsr305//jar'],
	plugins=['nullaway'],
	javacopts=[
		'-Xep:NullAway:ERROR',
		'-XepOpt:NullAway:AnnotatedPackages=com.example',
	],
)

java_plugin(
	name='nullaway',
	deps=[
		'@nullaway//jar',
		'@guava//jar',
	],
)