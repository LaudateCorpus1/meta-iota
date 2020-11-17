# Auto-Generated by cargo-bitbake 0.3.14
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get streams-gateway could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/streams-gateway/0.2.0"
SRC_URI += "git://git@github.com/honeycombOS/Streams-http-gateway;protocol=https;nobranch=1"
SRCREV = "ddd4c610666f003317ff2cf1c1997cadf69870bb"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV_append = ".AUTOINC+ddd4c61066"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.13.0 \
    crate://crates.io/adler/0.2.3 \
    crate://crates.io/ahash/0.3.8 \
    crate://crates.io/anyhow/1.0.33 \
    crate://crates.io/arc-swap/0.4.7 \
    crate://crates.io/async-channel/1.5.1 \
    crate://crates.io/async-task/3.0.0 \
    crate://crates.io/async-trait/0.1.41 \
    crate://crates.io/atomic-waker/1.0.0 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/backtrace/0.3.53 \
    crate://crates.io/base-x/0.2.6 \
    crate://crates.io/base64/0.12.3 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/block-padding/0.2.1 \
    crate://crates.io/blocking/0.4.7 \
    crate://crates.io/bumpalo/3.4.0 \
    crate://crates.io/byteorder/1.3.4 \
    crate://crates.io/bytes/0.5.6 \
    crate://crates.io/cache-padded/1.1.1 \
    crate://crates.io/cc/1.0.61 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.19 \
    crate://crates.io/chunked_transfer/1.3.0 \
    crate://crates.io/concurrent-queue/1.2.2 \
    crate://crates.io/const_fn/0.4.2 \
    crate://crates.io/cookie/0.14.2 \
    crate://crates.io/cookie_store/0.12.0 \
    crate://crates.io/cpuid-bool/0.1.2 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/curve25519-dalek/3.0.0 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/discard/1.0.4 \
    crate://crates.io/ed25519-dalek/1.0.1 \
    crate://crates.io/ed25519/1.0.3 \
    crate://crates.io/error-chain/0.12.4 \
    crate://crates.io/event-listener/2.5.1 \
    crate://crates.io/failure/0.1.8 \
    crate://crates.io/failure_derive/0.1.8 \
    crate://crates.io/fastrand/1.4.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/futures-channel/0.3.7 \
    crate://crates.io/futures-core/0.3.7 \
    crate://crates.io/futures-io/0.3.7 \
    crate://crates.io/futures-lite/0.1.11 \
    crate://crates.io/futures-sink/0.3.7 \
    crate://crates.io/futures-task/0.3.7 \
    crate://crates.io/futures-util/0.3.7 \
    crate://crates.io/gcc/0.3.55 \
    crate://crates.io/generic-array/0.14.4 \
    crate://crates.io/getrandom/0.1.15 \
    crate://crates.io/gimli/0.22.0 \
    crate://crates.io/h2/0.2.7 \
    crate://crates.io/hashbrown/0.8.2 \
    crate://crates.io/hashbrown/0.9.1 \
    crate://crates.io/hermit-abi/0.1.17 \
    crate://crates.io/hex/0.4.2 \
    crate://crates.io/http-body/0.3.1 \
    crate://crates.io/http/0.2.1 \
    crate://crates.io/httparse/1.3.4 \
    crate://crates.io/httpdate/0.3.2 \
    crate://crates.io/hyper/0.13.8 \
    crate://crates.io/idna/0.2.0 \
    crate://crates.io/indexmap/1.6.0 \
    crate://crates.io/instant/0.1.8 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/itoa/0.4.6 \
    crate://crates.io/js-sys/0.3.45 \
    crate://crates.io/keccak/0.1.0 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.80 \
    crate://crates.io/log/0.4.11 \
    crate://crates.io/matches/0.1.8 \
    crate://crates.io/memchr/2.3.3 \
    crate://crates.io/miniz_oxide/0.4.3 \
    crate://crates.io/mio-named-pipes/0.1.7 \
    crate://crates.io/mio-uds/0.6.8 \
    crate://crates.io/mio/0.6.22 \
    crate://crates.io/miow/0.2.1 \
    crate://crates.io/miow/0.3.5 \
    crate://crates.io/net2/0.2.35 \
    crate://crates.io/num-integer/0.1.43 \
    crate://crates.io/num-traits/0.2.12 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/object/0.21.1 \
    crate://crates.io/once_cell/1.4.1 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/parking/1.0.6 \
    crate://crates.io/parking/2.0.0 \
    crate://crates.io/percent-encoding/2.1.0 \
    crate://crates.io/pin-project-internal/0.4.27 \
    crate://crates.io/pin-project-internal/1.0.1 \
    crate://crates.io/pin-project-lite/0.1.11 \
    crate://crates.io/pin-project/0.4.27 \
    crate://crates.io/pin-project/1.0.1 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/ppv-lite86/0.2.9 \
    crate://crates.io/proc-macro-hack/0.5.18 \
    crate://crates.io/proc-macro2/1.0.24 \
    crate://crates.io/publicsuffix/1.5.4 \
    crate://crates.io/qstring/0.7.2 \
    crate://crates.io/quote/1.0.7 \
    crate://crates.io/rand/0.3.23 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.1.57 \
    crate://crates.io/regex-syntax/0.6.20 \
    crate://crates.io/regex/1.4.1 \
    crate://crates.io/ring/0.16.15 \
    crate://crates.io/rust-crypto/0.2.36 \
    crate://crates.io/rustc-demangle/0.1.18 \
    crate://crates.io/rustc-serialize/0.3.24 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/rustls/0.18.1 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/scoped-tls/1.0.0 \
    crate://crates.io/sct/0.6.0 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/serde/1.0.117 \
    crate://crates.io/serde_derive/1.0.117 \
    crate://crates.io/serde_json/1.0.59 \
    crate://crates.io/sha1/0.6.0 \
    crate://crates.io/sha2/0.9.1 \
    crate://crates.io/sha3/0.9.1 \
    crate://crates.io/signal-hook-registry/1.2.1 \
    crate://crates.io/signature/1.2.2 \
    crate://crates.io/slab/0.4.2 \
    crate://crates.io/smol/0.1.18 \
    crate://crates.io/socket2/0.3.15 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/standback/0.2.11 \
    crate://crates.io/stdweb-derive/0.5.3 \
    crate://crates.io/stdweb-internal-macros/0.2.9 \
    crate://crates.io/stdweb-internal-runtime/0.1.5 \
    crate://crates.io/stdweb/0.4.20 \
    crate://crates.io/subtle/2.3.0 \
    crate://crates.io/syn/1.0.48 \
    crate://crates.io/synstructure/0.12.4 \
    crate://crates.io/thiserror-impl/1.0.21 \
    crate://crates.io/thiserror/1.0.21 \
    crate://crates.io/time-macros-impl/0.1.1 \
    crate://crates.io/time-macros/0.1.1 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/time/0.2.22 \
    crate://crates.io/tiny-keccak/2.0.2 \
    crate://crates.io/tinyvec/0.3.4 \
    crate://crates.io/tokio-macros/0.2.5 \
    crate://crates.io/tokio-util/0.3.1 \
    crate://crates.io/tokio/0.2.22 \
    crate://crates.io/tower-service/0.3.0 \
    crate://crates.io/tracing-core/0.1.17 \
    crate://crates.io/tracing-futures/0.2.4 \
    crate://crates.io/tracing/0.1.21 \
    crate://crates.io/try-lock/0.2.3 \
    crate://crates.io/typenum/1.12.0 \
    crate://crates.io/unicode-bidi/0.3.4 \
    crate://crates.io/unicode-normalization/0.1.13 \
    crate://crates.io/unicode-xid/0.2.1 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/ureq/1.5.1 \
    crate://crates.io/url/2.1.1 \
    crate://crates.io/version_check/0.9.2 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.68 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.68 \
    crate://crates.io/wasm-bindgen-macro/0.2.68 \
    crate://crates.io/wasm-bindgen-shared/0.2.68 \
    crate://crates.io/wasm-bindgen/0.2.68 \
    crate://crates.io/web-sys/0.3.45 \
    crate://crates.io/webpki-roots/0.20.0 \
    crate://crates.io/webpki/0.21.3 \
    crate://crates.io/wepoll-sys-stjepang/1.0.8 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/ws2_32-sys/0.2.1 \
    crate://crates.io/x25519-dalek/1.1.0 \
    crate://crates.io/zeroize/1.1.1 \
    crate://crates.io/zeroize_derive/1.0.1 \
    git://github.com/Alex6323/bee-p.git;protocol=https;nobranch=1;name=bee-transaction;destsuffix=bee-transaction \
    git://github.com/honeycombOS/streams-gateway-core;protocol=https;nobranch=1;name=gateway_core;destsuffix=gateway_core \
    git://github.com/iotaledger/bee.git;protocol=https;nobranch=1;name=bee-common-derive;destsuffix=bee-common-derive \
    git://github.com/iotaledger/bee.git;protocol=https;nobranch=1;name=bee-crypto;destsuffix=bee-crypto \
    git://github.com/iotaledger/bee.git;protocol=https;nobranch=1;name=bee-signing;destsuffix=bee-signing \
    git://github.com/iotaledger/bee.git;protocol=https;nobranch=1;name=bee-ternary;destsuffix=bee-ternary \
    git://github.com/iotaledger/iota.rs;protocol=https;nobranch=1;name=iota-client;destsuffix=iota-client \
    git://github.com/iotaledger/iota.rs;protocol=https;nobranch=1;name=iota-core;destsuffix=iota-core \
    git://github.com/iotaledger/streams;protocol=https;nobranch=1;name=iota-streams-app-channels;destsuffix=iota-streams-app-channels \
    git://github.com/iotaledger/streams;protocol=https;nobranch=1;name=iota-streams-app;destsuffix=iota-streams-app \
    git://github.com/iotaledger/streams;protocol=https;nobranch=1;name=iota-streams-core-edsig;destsuffix=iota-streams-core-edsig \
    git://github.com/iotaledger/streams;protocol=https;nobranch=1;name=iota-streams-core-keccak;destsuffix=iota-streams-core-keccak \
    git://github.com/iotaledger/streams;protocol=https;nobranch=1;name=iota-streams-core;destsuffix=iota-streams-core \
    git://github.com/iotaledger/streams;protocol=https;nobranch=1;name=iota-streams-ddml;destsuffix=iota-streams-ddml \
    git://github.com/iotaledger/streams;protocol=https;nobranch=1;name=iota-streams;destsuffix=iota-streams \
"

SRCREV_FORMAT .= "_bee-common-derive"
SRCREV_bee-common-derive = "dev"
EXTRA_OECARGO_PATHS += "${WORKDIR}/bee-common-derive"
SRCREV_FORMAT .= "_bee-crypto"
SRCREV_bee-crypto = "dev"
EXTRA_OECARGO_PATHS += "${WORKDIR}/bee-crypto"
SRCREV_FORMAT .= "_bee-signing"
SRCREV_bee-signing = "dev"
EXTRA_OECARGO_PATHS += "${WORKDIR}/bee-signing"
SRCREV_FORMAT .= "_bee-ternary"
SRCREV_bee-ternary = "dev"
EXTRA_OECARGO_PATHS += "${WORKDIR}/bee-ternary"
SRCREV_FORMAT .= "_bee-transaction"
SRCREV_bee-transaction = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/bee-transaction"
SRCREV_FORMAT .= "_gateway_core"
SRCREV_gateway_core = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/gateway_core"
SRCREV_FORMAT .= "_iota-client"
SRCREV_iota-client = "iota-1.0"
EXTRA_OECARGO_PATHS += "${WORKDIR}/iota-client"
SRCREV_FORMAT .= "_iota-core"
SRCREV_iota-core = "iota-1.0"
EXTRA_OECARGO_PATHS += "${WORKDIR}/iota-core"
SRCREV_FORMAT .= "_iota-streams"
SRCREV_iota-streams = "develop"
EXTRA_OECARGO_PATHS += "${WORKDIR}/iota-streams"
SRCREV_FORMAT .= "_iota-streams-app"
SRCREV_iota-streams-app = "develop"
EXTRA_OECARGO_PATHS += "${WORKDIR}/iota-streams-app"
SRCREV_FORMAT .= "_iota-streams-app-channels"
SRCREV_iota-streams-app-channels = "develop"
EXTRA_OECARGO_PATHS += "${WORKDIR}/iota-streams-app-channels"
SRCREV_FORMAT .= "_iota-streams-core"
SRCREV_iota-streams-core = "develop"
EXTRA_OECARGO_PATHS += "${WORKDIR}/iota-streams-core"
SRCREV_FORMAT .= "_iota-streams-core-edsig"
SRCREV_iota-streams-core-edsig = "develop"
EXTRA_OECARGO_PATHS += "${WORKDIR}/iota-streams-core-edsig"
SRCREV_FORMAT .= "_iota-streams-core-keccak"
SRCREV_iota-streams-core-keccak = "develop"
EXTRA_OECARGO_PATHS += "${WORKDIR}/iota-streams-core-keccak"
SRCREV_FORMAT .= "_iota-streams-ddml"
SRCREV_iota-streams-ddml = "develop"
EXTRA_OECARGO_PATHS += "${WORKDIR}/iota-streams-ddml"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "streams-gateway"
HOMEPAGE = "https://github.com/iot2tangle/Streams-http-gateway"
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include streams-gateway-${PV}.inc
include streams-gateway.inc
