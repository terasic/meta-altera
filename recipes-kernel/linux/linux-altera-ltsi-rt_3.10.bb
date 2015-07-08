PR = "r2"

LINUX_VERSION_SUFFIX = "-ltsi-rt"

KTYPE = "preempt-rt"

SRCREV ?= "${AUTOREV}"

require recipes-kernel/linux/linux-altera.inc

